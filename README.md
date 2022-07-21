# properties-data
A simple Java library to get, set some data to a .proper file.

A Java library in .jar very easy to use to get and set multiple data such as `String`, `Integer`, `Double`, `Float` or `Boolean`.

```java
PropertiesFile file = new PropertiesFile(
                // Your file path.
                "path",
                // Your file name.
                "name",
                // Your standard file creation type.
                StandardFileCreationType.ONLY_WANTED_FILE,
                // Your standard directory creation type.
                StandardDirectoryCreationType.IGNORE,
                // Your key value separator.
                KeyValueSeparator.DOUBLE_POINTS_AND_SPACE
        );
```
```java
file.create();
```
```java
file.getString("language")
// It will return "Java" (without quotation marks).
```

The .jar is comming in a future update.
