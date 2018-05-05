package fr.neamar.kiss.pojo;

import android.graphics.Bitmap;

public class ShortcutsPojo extends PojoWithTags {

    public static final String SCHEME = "shortcut://";
    public static final String OREO_PREFIX = "oreo-shortcut/";

    public String packageName;
    public String resourceName;
    public String intentUri;
    public Bitmap icon;

}
