package edu.ucsd.cs110.temperature;
public class Fahrenheit extends Temperature
{
    public Fahrenheit(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        //C = ((F - 32) * 5)/9
        float c_temp = (this.getValue() - 32) * 5 / 9;

        return new Celsius(c_temp);
    }

    @Override
    public Temperature toFahrenheit() {
        return this;
    }

    public String toString()
    {
        // TODO: Complete this method
        float temp = this.getValue();
        String s = String.valueOf(temp);
        s = s.concat(" F");
        return s;
    }
}