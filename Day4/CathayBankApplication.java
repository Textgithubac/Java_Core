package com.Day4;

import java.util.Arrays;

public class CathayBankApplication {
	 public static final String[] VALID_POSTS = {"Probationary Officer", "Assistant", "Special Cadre Officer"};

	    public static class CathayBankException extends Exception {
	        public CathayBankException(String message) {
	            super(message);
	        }
	    }

	    public static class Applicant {
	        private String applicantName;
	        private String postApplied;
	        private int applicantAge;

	        public Applicant(String name, String post, int age) throws CathayBankException {
	            validateApplicantName(name);
	            validatePost(post);
	            validateAge(age);
	            this.applicantName = name;
	            this.postApplied = post;
	            this.applicantAge = age;
	        }

	        private static void validateApplicantName(String name) throws CathayBankException {
	            if (!name.matches("[A-Za-z ]+")) {
	                throw new CathayBankException("Invalid Applicant Name: Only alphabets and spaces allowed");
	            }
	            if (name.length() < 3) {
	                throw new CathayBankException("Invalid Applicant Name: Must be at least 3 characters long");
	            }
	        }

	        private static void validatePost(String post) throws CathayBankException {
	            if (!Arrays.asList(VALID_POSTS).contains(post)) {
	                throw new CathayBankException("Invalid post: " + post + ". Valid options are: " + Arrays.toString(VALID_POSTS));
	            }
	        }

	        private static void validateAge(int age) throws CathayBankException {
	            if (age < 18 || age > 60) {
	                throw new CathayBankException("Invalid Age: Must be between 18 and 60 (inclusive)");
	            }
	        }

	        public String getApplicantName() {
	            return applicantName;
	        }

	        public String getPostApplied() {
	            return postApplied;
	        }

	        public int getApplicantAge() {
	            return applicantAge;
	        }

	        @Override
	        public String toString() {
	            return "Applicant [applicantName=" + applicantName + ", postApplied=" + postApplied + ", applicantAge=" + applicantAge + "]";
	        }
	    }

	    public static void main(String[] args) {
	        try {
	            Applicant applicant1 = new Applicant("Marry", "Assistant", 34);
	            System.out.println(applicant1); // Output: CathayBankException: Invalid Age: Must be between 18 and 60 (inclusive)

	            Applicant applicant2 = new Applicant("Mary", "Clerk", 27);
	            System.out.println(applicant2); // Output: CathayBankException: Invalid post: Clerk. Valid options are: [Probationary Officer, Assistant, Special Cadre Officer]

	            //Applicant applicant3 = new Applicant("Probationary Officer", 30);
	           // System.out.println(applicant3); // Output: CathayBankException: Invalid Applicant Name: Only alphabets and spaces allowed

	           // Applicant applicant4 = new Applicant("Joseph", "Probationary Officer", 30);
	            //System.out.println(applicant4); // Output: Applicant [applicantName=Joseph, postApplied=Probationary Officer, applicantAge=30]

	        } catch (CathayBankException e) {
	            System.out.println(e.getMessage());
	        }

	        // Optional: Check if a post is valid
	        System.out.println(isValidPost("Manager")); // Output: false
	        System.out.println(isValidPost("Assistant")); // Output: true
	    }

	    public static boolean isValidPost(String post) {
	        return Arrays.asList(VALID_POSTS).contains(post);
	    }
}



