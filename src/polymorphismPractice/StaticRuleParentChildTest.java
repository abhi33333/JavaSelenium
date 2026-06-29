package polymorphismPractice;

public class StaticRuleParentChildTest {
	
	 public static void main(String[] args) {

		 StaticRuleParent.display();

		 StaticRuleParentChild.display();

		 StaticRuleParent obj = new StaticRuleParentChild();

	        obj.display();
	    }

}
