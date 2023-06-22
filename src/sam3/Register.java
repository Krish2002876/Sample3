package sam3;

 class Register {
		private  String fullName;
	    private String lastName;
	    
	    private String password;
	    private String emailId;
	    
	    public String getFirstName() {
	        return fullName;
	    }
	    public void setFirstName(String fullName) {
	       this.fullName = fullName;
	    }
	    public String getLastName() {
	        return lastName;
	    }
	    public void setLastName(String lastName) {
	        this.lastName = lastName;
	    }
	    public String getEmailId() {
	        return emailId;
	    }
	    public void setEmailId(String emailId) {
	        this.emailId = emailId;
	    }
	    public String getPassword() {
	        return password;
	    }
	    public void setPassword(String password) {
	        this.password = password;
	    }	   
}
