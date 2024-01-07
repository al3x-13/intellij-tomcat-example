package cd.tomcat.example;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

@WebService
public interface MathUtility {
    @WebMethod
    int addIntegers(int firstNum, int secondNum);

    @WebMethod
    int factorial(int n);
}