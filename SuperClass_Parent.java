/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooRestaurants;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class SuperClass_Parent {
    public double Filet_O_Fish;
    public double ChickenBurger;
    public double ChickenBurgerM;
    public double BaconCheeseBurger;
    public double ChickenLegend;
    
    public double MilkShake;
    public double VanillaCone;
    public double ClasVanilla;
    public double VanMilkShake;
    public double ChocMilkShake;
    
    public double Meals;
    public double Drinks;
    public double TotalofMD;
    
    public double AllTotalofMD;
    
    
    public double GetAmount(){
        Meals = Filet_O_Fish + ChickenBurger + ChickenBurgerM + BaconCheeseBurger + ChickenLegend;
        Drinks = MilkShake + VanillaCone + ClasVanilla + VanMilkShake + ChocMilkShake;
        TotalofMD = Meals + Drinks;
        AllTotalofMD = TotalofMD;
        return AllTotalofMD + Drinks;
    }
    
    private JFrame frame;
    
    public void iExitSystem(){
        frame = new JFrame("Exit");
        
        if(JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Restaurant Management System",JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION){
            System.exit(0);
        }
    }
    //===========================Price==============================
    public double pFilet_O_Fish=50;
    public double pChickenBurger=80;
    public double pChickenBurgerM=85;
    public double pBaconCheeseBurger=90;
    public double pChickenLegend=95;
    
    public double pMilkShake=35;
    public double pVanillaCone=65;
    public double pClasVanilla=70;
    public double pVanMilkShake=70;
    public double pChocMilkShake=55;
    //==============================================================
    
    public double mcTax = 0.90;
    
    public double cFindTax(double cAmount){
        double FindTax = cAmount -(cAmount * mcTax);
        return FindTax;
    }
}
