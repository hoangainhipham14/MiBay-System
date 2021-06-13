
public class PlatinumPackage extends Package {
	
	private String memberNumber;
	
	public PlatinumPackage(Customer customer, Product product, String memberNumber) throws InvalidInputException {
		super(customer, product);
		memberNum(memberNumber);	
	}
	
	public boolean updateMemberNumber(String memberNumber) {
		this.memberNumber = memberNumber;
		return true;
	}
	
	public void memberNum(String memberNumber) throws InvalidInputException {
		
		if (memberNumber.length() != 10) {
			throw new InvalidInputException("Member number is shorter than 10 characters");
		} else {
			for (int i = 1; i < 10; i++) {
				if (!(i % 2 == 1 & Character.isLetter(memberNumber.charAt(i)))) {
					throw new InvalidInputException("Invalid member number");
				} 
				
				if (!(i % 2 == 0 & Character.isDigit(memberNumber.charAt(i)))) {
					throw new InvalidInputException("Invalid member number");
				} 
			}
			this.memberNumber = memberNumber;
		}
	}
}
