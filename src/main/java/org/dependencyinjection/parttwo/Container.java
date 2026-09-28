package org.dependencyinjection.parttwo;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

public class Container {

    private final Map<Class<?>, Class<?>> bindings = new HashMap<>();
    /**
     * Creates an instance of the requested type and recursively resolves
     * its constructor dependencies.
     */
    public <T> T getInstance(Class<T> type) {

        Class<?> implementation = bindings.get(type);

        if (implementation == null) {
            implementation = type;
        }

        // We assume that each implementation has one public constructor.
        Constructor<?> constructor = implementation.getConstructors()[0];
        Class<?>[] parameterTypes = constructor.getParameterTypes();
        Object[] dependencies = new Object[parameterTypes.length];

        // Recursively resolve each constructor dependency.
        for (int i = 0; i < parameterTypes.length; i++) {
            dependencies[i] = getInstance(parameterTypes[i]);
        }

        try {
            Object instance = constructor.newInstance(dependencies);
            return type.cast(instance);
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(
                    "Could not create instance of " + implementation.getName(),
                    e
            );
        }
    }

    public <T> void register(
            Class<T> abstraction,
            Class<? extends T> implementation
    ) {
        bindings.put(abstraction, implementation);
    }
}
