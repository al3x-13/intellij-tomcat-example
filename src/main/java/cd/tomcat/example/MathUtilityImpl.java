package cd.tomcat.example;

import jakarta.jws.WebService;

@WebService(endpointInterface = "cd.tomcat.example.MathUtility", serviceName = "MathUtilitySOAP")
public class MathUtilityImpl implements MathUtility {
    @Override
    public int addIntegers(int firstNum, int secondNum) {
        return firstNum + secondNum;
    }

    @Override
    public int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }
}