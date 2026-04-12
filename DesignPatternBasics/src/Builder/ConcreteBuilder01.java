/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Builder;

public class ConcreteBuilder01 implements Builder{
    String str;
    @Override
    public void buiderPart1(String str) {
    	setString(str);
    }

    @Override
    public void buiderPart2(String str) {
    	setString(str);
    }

    @Override
    public void buiderPart3(String str) {
    	setString(str);
    }

	@Override
	public Object getResult() {
		return this.str;
	}
	
	private void setString(String str) {
        if (this.str == null) {
        	this.str = str + ":";
        } else {   
    	    this.str += str + ":";
        }
	}
}
