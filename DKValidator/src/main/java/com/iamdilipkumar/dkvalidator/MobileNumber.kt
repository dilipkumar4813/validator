package com.iamdilipkumar.dkvalidator

class MobileNumber(val mobileNumber: String) {

    /**
     * Method to remove all special characters
     * @return - cleaned Phone number string
     */
    fun removeSpecialCharacters(): String {
        var num = mobileNumber.replace(" ","")
        num = num.replace("+","")
        return num.replace("-","")
    }

    /**
     * Method to remove all hypens and space only
     * @return - cleaned Phone number string
     */
    fun removeHyphenAndSpace(): String {
        var num = mobileNumber.replace(" ","")
        return num.replace("-","")
    }

    /**
     * Country code to send along with plus,
     * the function will remove the country code or default initial character of the phone number during validations
     * @return - Validated phone number without country code
     */
    fun removeCountryCode(countryCode: String, defaultFirstNumber: Char): String {
        if (mobileNumber.contains(countryCode)){
            return mobileNumber.replace(countryCode,"")
        } else if (mobileNumber[0]==defaultFirstNumber) {
            return mobileNumber.substring(1,mobileNumber.length - 1)
        }

        return mobileNumber
    }
}