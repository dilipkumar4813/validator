package com.iamdilipkumar.dkvalidator

class MobileNumber(val mobileNumber: String) {

    /**
     * Method to remove all special characters
     * @return - cleaned mobile number string
     */
    fun removeSpecialCharacters(): String {
        var num = mobileNumber.replace(" ","")
        num = num.replace("+","")
        return num.replace("-","")
    }

    /**
     * Method to remove all hypens and space only
     * @return - cleaned mobile number string
     */
    fun removeHyphenAndSpace(): String {
        val num = mobileNumber.replace(" ","")
        return num.replace("-","")
    }

    /**
     * Country code to send along with plus,
     * the function will remove the country code or default initial character of the mobile number during validations
     * @return - Validated mobile number without country code
     */
    fun removeCountryCode(countryCode: String, defaultFirstNumber: Char): String {
        if(countryCode.isNullOrBlank()) {
            return mobileNumber
        }

        if (mobileNumber.contains(countryCode)){
            return mobileNumber.replace(countryCode,"")
        } else if (mobileNumber[0]==defaultFirstNumber) {
            return mobileNumber.substring(1,mobileNumber.length - 1)
        }

        return mobileNumber
    }

    /**
     * Encrypt the characters inbetween based on how many characters to show in the start and in the end
     * @return - encrypted mobile number
     */
    fun encryptCharacters(character: String, showFirstCount: Int, showLastCount: Int): String {
        if(character.isNullOrBlank()) {
            return mobileNumber
        }

        if (showFirstCount + showLastCount >= mobileNumber.length) {
            return mobileNumber
        }

        val replacementCharCount = mobileNumber.length - (showFirstCount + showLastCount)
        var charSequence = ""
        for (i in 1..replacementCharCount) {
            charSequence += character[0]
        }

        val startIndex = showFirstCount - 1
        val endIndex = (mobileNumber.length - 1) - showLastCount

        return mobileNumber.replaceRange(startIndex, endIndex, charSequence)
    }
}