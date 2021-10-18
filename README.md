[![injectable-factory-compiler](https://maven-badges.herokuapp.com/maven-central/io.github.jbock-java/injectable-factory-compiler/badge.svg?color=grey&subject=injectable-factory-compiler)](https://maven-badges.herokuapp.com/maven-central/io.github.jbock-java/injectable-factory-compiler)
[![injectable-factory](https://maven-badges.herokuapp.com/maven-central/io.github.jbock-java/injectable-factory/badge.svg?subject=injectable-factory)](https://maven-badges.herokuapp.com/maven-central/io.github.jbock-java/injectable-factory)

This is a clone of [auto-factory](https://github.com/google/auto/tree/master/factory) that has a module descriptor
and generates `jakarta.inject.*` annotations instead of `javax.inject.*`.

Add to `module-info.java`:

````
requires com.google.auto.factory;
````

Gradle users add this to `build.gradle`:

````groovy
implementation('io.github.jbock-java:injectable-factory:1.0')
annotationProcessor('io.github.jbock-java:injectable-factory-compiler:1.0')
````
