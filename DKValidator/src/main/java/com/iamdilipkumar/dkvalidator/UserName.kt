package com.iamdilipkumar.dkvalidator

public class UserName(val name: String) {

    /**
     * Return the names that is separated by space
     * @return - List of strings separated by space
     */
    fun nameList(): List<String> {
        return name.split(" ")
    }

    /**
     * Remove the white spaces in the string
     * @return - string without spaces
     */
    fun removeSpaces(): String {
        return name.replace(" ","", true)
    }

    /**
     * Convert name to uppercase
     * @return - uppercased name
     */
    fun uppercase(): String {
        return name.toUpperCase()
    }

    /**
     * Convert name to lowercase
     * @return - lowercased name
     */
    fun lowercase(): String {
        return name.toLowerCase()
    }
}