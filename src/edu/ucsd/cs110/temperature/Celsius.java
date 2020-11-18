package edu.ucsd.cs110.temperature;
public class Celsius extends Temperature
{
    public Celsius(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        return this;
    }

    @Override
    public Temperature toFahrenheit() {
        //F = ((C*9)/5) + 32
        float f_temperature = getValue() * 9 / 5 + 32;
        Fahrenheit f = new Fahrenheit(f_temperature);
        return f;
    }

    public String toString()
    {
        // TODO: Complete this method
        float temp = this.getValue();
        String s = String.valueOf(temp);
        s = s.concat(" C");
        return s;
    }
}