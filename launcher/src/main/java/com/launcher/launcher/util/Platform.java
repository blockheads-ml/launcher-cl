

package com.launcher.launcher.util;

import javax.xml.bind.annotation.XmlEnumValue;

/**
 * Indicates the platform.
 */
public enum Platform {
    @XmlEnumValue("windows") WINDOWS,
    @XmlEnumValue("mac_os_x") MAC_OS_X,
    @XmlEnumValue("linux") LINUX,
    @XmlEnumValue("solaris") SOLARIS,
    @XmlEnumValue("unknown") UNKNOWN
}