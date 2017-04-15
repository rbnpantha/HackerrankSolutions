

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class EmployeeAdmin implements Comparator<Employee>{
	
	/**
		Returns a list of Employees whose social security number is on the input list socSecNums
		and whose salary is > 80000. The list must be ordered by social security number,
		from lowest to highest. To sort, you must use a Collections sorting method
		and you must define your own Comparator to be used to compare Employees by ssn. 
	*/
	public static List<Employee> prepareReport(HashMap<String, Employee> table, List<String> socSecNums) {
		//IMPLEMENT
		List<Employee> empReport = new ArrayList<Employee>();
		for(String ssn : socSecNums){
			if(table.containsKey(ssn)){
				if(table.get(ssn).getSalary() > 80000)
					empReport.add((Employee) table.get(ssn));
			}
		}
		
		Collections.sort(empReport, new EmployeeAdmin());
		
		return empReport;
		
	}

	@Override
	public int compare(Employee o1, Employee o2) {
		
		return o1.getSsn().compareTo(o2.getSsn());
	}

	
	
}
