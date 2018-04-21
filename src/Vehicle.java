
import java.io.Serializable;
import java.util.InputMismatchException;
import javax.swing.JOptionPane;

public class Vehicle
{

    protected String make = " ";
    protected String model = " ";
    protected double purchasePrice = 0.0;
    protected double askingPrice = 0.0;
    static int vehCount;

    public Vehicle(String make,String model, double purchasePrice, double askingPrice)
    {
        this.make = make;
        this.model = model;
        this.purchasePrice = purchasePrice;
        this.askingPrice = askingPrice;
    }

    String getMake()
    {
        return make;
    }

    void setMake(String make)
    {
        this.make = make;
    }

    String getModel()
    {
        return model;
    }

    void setModel(String model)
    {
        this.model = model;
    }

    double getPurchasePrice()
    {
        return purchasePrice;
    }


    void setPurchasePrice(double purchasePrice)
    {
        this.purchasePrice = purchasePrice;
    }

    double getAskingPrice()
    {
        return askingPrice;
    }

    void setAskingPrice(double askingPrice)
    {
        this.askingPrice = askingPrice;
    }

    boolean deal (double custOffer)
    {
        if(custOffer >= askingPrice)
        {
            return True;
        }
        else
        {
            return False;
        }
    }

    void remove()
    {
        this.make = " ";
        this.model = " ";
        this.askingPrice = 0.0;
        this.purchasePrice = 0.0;

    }

}
