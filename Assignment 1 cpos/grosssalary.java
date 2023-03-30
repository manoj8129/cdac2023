class grosssalary {
public static void main (String args [] ){
	double Basic = 10000.8989009;
	double TA = 5600.6778;
	double DA = 0.14 * Basic;
    double pa = 7000.3443534546;
  	double Td = (1.76/100) * DA;
	double Salary = ( Basic + TA + DA + pa - Td);
	System.out.println("in hand="+Salary  );
}

}
