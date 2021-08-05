package com.sz.leetcode.string;


/**
 * 
 * Input: address = "1.1.1.1"
 * Output: "1[.]1[.]1[.]1"
 *
 */
public class DefangingIP_1108 {

	public static void main(String[] args) {

	}

	
	public String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }
}
