package com.fasterxml.aalto.util;

import java.lang.reflect.Array;

public final class DataUtil
{
    final static char[] EMPTY_CHAR_ARRAY = new char[0];

    private DataUtil() { }

    public static char[] getEmptyCharArray() {
        return EMPTY_CHAR_ARRAY;
    }

    /*
    ////////////////////////////////////////////////////////////
    // Methods for common operations on std data structs
    ////////////////////////////////////////////////////////////
    */

    public static String[] growArrayBy(String[] arr, int more)
    {
        if (arr == null) {
            return new String[more];
        }
        String[] old = arr;
        int len = arr.length;
        arr = new String[len + more];
        System.arraycopy(old, 0, arr, 0, len);
        return arr;
    }

    public static int[] growArrayBy(int[] arr, int more)
    {
        if (arr == null) {
            return new int[more];
        }
        int[] old = arr;
        int len = arr.length;
        arr = new int[len + more];
        System.arraycopy(old, 0, arr, 0, len);
        return arr;
    }

    public static char[] growArrayBy(char[] arr, int more)
    {
        if (arr == null) {
            return new char[more];
        }
        char[] old = arr;
        int len = arr.length;
        arr = new char[len + more];
        System.arraycopy(old, 0, arr, 0, len);
        return arr;
    }

    public static Object growAnyArrayBy(Object arr, int more)
    {
        if (arr == null) {
            throw new IllegalArgumentException("Null array");
        }
        Object old = arr;
        int len = Array.getLength(arr);
        arr = Array.newInstance(arr.getClass().getComponentType(), len + more);
        System.arraycopy(old, 0, arr, 0, len);
        return arr;
    }
}
 
