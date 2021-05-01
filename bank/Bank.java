package bank;

import java.util.ArrayList;

public class Bank {
	
	private static ArrayList<Branch> branches = new ArrayList<Branch>();
	public Bank(String bankName) 
	{
	}
	public void addNewBranch(String branchName) {
		if(findPosition_BranchName(branchName)<0)
			branches.add(new Branch(branchName));
		else
			System.out.println("The branch "+branchName+" already exists"); 
	}
	private int findPosition_BranchName(String branchName) {
		for(int i=0;i<branches.size();i++) {
			if(branchName.equals(branches.get(i).getBranchName()))
					return i;
		}
		return -1;
	}
	public Branch getBranch(String branchName) {

		return branches.get(findPosition_BranchName(branchName));
		
		
	}
	/*
	 * private int findPosition_Branch(Branch branch) { return
	 * branches.indexOf(branch); }
	 */


}
