/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Builder;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kinopp
 */
public class ConcreteBuilder02 implements Builder{
	List<String> list = new ArrayList<>();
    @Override
    public void buiderPart1(String str) {
        list.add("01:" + str);
    }

    @Override
    public void buiderPart2(String str) {
    	list.add("02:" + str);
    }

    @Override
    public void buiderPart3(String str) {
    	list.add("03:" + str);
    }

	@Override
	public Object getResult() {
		return list;
	}
}
