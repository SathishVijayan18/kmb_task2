package com.task2.kmb;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Hashtable;
import org.json.simple.JSONObject;
import java.util.Map;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class EmpDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public EmpDetails() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("application/json");
		int empId = Integer.parseInt(request.getParameter("empId"));
		Hashtable<Integer, Employee> ht = new Hashtable<Integer, Employee>();

		Employee obj = new Employee(101, "sathish", 22000, 2001);
		Employee obj1 = new Employee(102, "raina", 22500, 2002);
		Employee obj2 = new Employee(103, "vishal", 22600, 2003);
		ht.put(101, obj);
		ht.put(102, obj1);
		ht.put(103, obj2);
		System.out.println(ht);

		// if(ht.contains(obj)) {
		// String empName=request.getParameter("empName");
		// int empSalary=Integer.parseInt(request.getParameter("empSalary"));
		// int DeptCode=Integer.parseInt(request.getParameter("DeptCode"));
		// System.out.println(ht.get(empName));
		// System.out.println(ht);

		for (Map.Entry<Integer, Employee> entry : ht.entrySet()) {
			int key = entry.getKey();
			System.out.println(key);
			if (key == empId) {
				//System.out.println("key " + key);
				Employee b = entry.getValue();
				// System.out.println(b.empId+" "+b.empName+" "+b.empSal+" "+b.DeptCode);
				// System.out.println(key+" "+b);
				JSONObject js = new JSONObject();
				js.put(empId, ht.get(empId));
				System.out.println(js);
				out.println(js);
			}
			// JSONObject js=new JSONObject();
			// js.put(empId,ht.get(empId));
			// out.println(js);
			// System.out.println(js);
		}
	}
}