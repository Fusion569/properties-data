package fr.fusion569.propertiesdata.utils;

import fr.fusion569.propertiesdata.files.PropertiesFile;

/**
 * This enumeration represents standard directory creation type when the {@link PropertiesFile} {@link java.io.File} is created.
 */
public enum StandardDirectoryCreationType {

    /**
     * Only the file will be created.
     */
    IGNORE,
    /**
     * The file and its directory will be created if not.
     */
    CREATE;
}
