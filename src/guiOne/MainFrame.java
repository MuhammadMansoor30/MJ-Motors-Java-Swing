package guiOne;

import javax.swing.*;


public class MainFrame extends JFrame {


    public static MainJPanel mainJPanel = new MainJPanel();
    public static CustomerCarsSection customerCarsSection = new CustomerCarsSection();
    public static ManagerCarsSection managerCarsSection = new ManagerCarsSection();
    public static ManagerLocalCarsJPanel managerLocalCarsJPanel = new ManagerLocalCarsJPanel();
    public static ManagerImportedCarsJPanel managerImportedCarsJPanel = new ManagerImportedCarsJPanel();
    public static ManagerNewImportedCarFunction managerNewImportedCarFunction = new ManagerNewImportedCarFunction();
    public static ManagerOldImportedCarFunction managerOldImportedCarFunction = new ManagerOldImportedCarFunction();
    public static CustomerLocalCarFunctions customerLocalCarFunction = new CustomerLocalCarFunctions();
    public static CustomerImportedCarFunctions customerImportedCarFunctions = new CustomerImportedCarFunctions();
    public static ManagerImportedNewAddCar managerImportedNewAddCar = new ManagerImportedNewAddCar();
    public static ManagerImportedNewUpdateCar managerImportedNewUpdateCar = new ManagerImportedNewUpdateCar();
    public static ManagerImportedNewRemoveCar managerImportedNewRemoveCar = new ManagerImportedNewRemoveCar();
    public static ManagerImportedOldAddCar managerImportedOldAddCar = new ManagerImportedOldAddCar();
    public static ManagerImportedOldUpdateCar managerImportedOldUpdateCar = new ManagerImportedOldUpdateCar();
    public static ManagerImportedOldRemoveCar managerImportedOldRemoveCar = new ManagerImportedOldRemoveCar();
    public static ManagerLocalNewCarFunction managerLocalNewCarFunction = new ManagerLocalNewCarFunction();
    public static CustomerLocalPurchaseCarFunctions customerLocalPurchaseCarFunctions = new CustomerLocalPurchaseCarFunctions();
    public static CustomerImportedNewCarPurchase customerImportedNewCarPurchase = new CustomerImportedNewCarPurchase();
    public static ManagerLocalNewAddCar managerLocalNewAddCar = new ManagerLocalNewAddCar();
    public static CustomerImportedCarFunctionsSellCar customerImportedCarFunctionsSellCar = new CustomerImportedCarFunctionsSellCar();
    public static ManagerLocalNewUpdateCar managerLocalNewUpdateCar = new ManagerLocalNewUpdateCar();
    public static ManagerLocalNewRemoveCar managerLocalNewRemoveCar = new ManagerLocalNewRemoveCar();
    public static ManagerLocalOldCarFunction managerLocalOldCarFunction = new ManagerLocalOldCarFunction();
    public static ManagerLocalOldUpdateCar managerLocalOldUpdateCar = new ManagerLocalOldUpdateCar();
    public static ManagerLocalOldAddCar managerLocalOldAddCar = new ManagerLocalOldAddCar();
    public static ManagerLocalOldRemoveCar managerLocalOldRemoveCar = new ManagerLocalOldRemoveCar();
    public static CustomerImportedCarsDetails customerImportedCarsDetails = new CustomerImportedCarsDetails();
    public static CustomerImportedPurchaseCarFunctions customerImportedPurchaseCarFunctions = new CustomerImportedPurchaseCarFunctions();
    public static CustomerImportedSellCarToUs customerImportedSellCarToUs = new CustomerImportedSellCarToUs();
    public static CustomerImportedPlaceCarSell customerImportedPlaceCarSell = new CustomerImportedPlaceCarSell();
    public static CustomerImportedOldCarPurchase customerImportedOldCarPurchase = new CustomerImportedOldCarPurchase();
    public static CustomerLocalCarsDetails customerLocalCarsDetails = new CustomerLocalCarsDetails();
    public static CustomerLocalNewCarPurchase customerLocalNewCarPurchase = new CustomerLocalNewCarPurchase();
    public static CustomerLocalOldCarPurchase customerLocalOldCarPurchase = new CustomerLocalOldCarPurchase();
    public static CustomerLocalPlaceCarSell customerLocalPlaceCarSell = new CustomerLocalPlaceCarSell();
    public static CustomerLocalCarsFunctionsSellCar customerLocalCarsFunctionsSellCar = new CustomerLocalCarsFunctionsSellCar();
    public static CustomerLocalSellCarToUs customerLocalSellCarToUs = new CustomerLocalSellCarToUs();

    ImageIcon imageIcon;

    public MainFrame() {

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setSize(600, 600);
        setTitle("MJ MOTORS pvt.(LTD) ");
        setVisible(true);


        this.add(mainJPanel);
        imageIcon = new ImageIcon("carPic.png");
        this.add(customerCarsSection);
        customerCarsSection.setVisible(false);

        this.add(managerCarsSection);
        managerCarsSection.setVisible(false);

        this.add(managerLocalCarsJPanel);
        managerLocalCarsJPanel.setVisible(false);

        this.add(managerImportedCarsJPanel);
        managerImportedCarsJPanel.setVisible(false);

        this.add(managerNewImportedCarFunction);
        managerNewImportedCarFunction.setVisible(false);

        this.add(managerOldImportedCarFunction);
        managerOldImportedCarFunction.setVisible(false);

        this.add(customerLocalCarFunction);
        customerLocalCarFunction.setVisible(false);

        this.add(customerImportedCarFunctions);
        customerImportedCarFunctions.setVisible(false);

        this.add(managerImportedNewAddCar);
        managerImportedNewAddCar.setVisible(false);

        this.add(managerImportedNewUpdateCar);
        managerImportedNewUpdateCar.setVisible(false);

        this.add(managerImportedNewRemoveCar);
        managerImportedNewRemoveCar.setVisible(false);

        this.add(customerLocalPurchaseCarFunctions);
        customerLocalPurchaseCarFunctions.setVisible(false);

        this.add(customerImportedNewCarPurchase);
        customerImportedNewCarPurchase.setVisible(false);

        this.add(customerImportedCarFunctionsSellCar);
        customerImportedCarFunctionsSellCar.setVisible(false);

        this.add(managerLocalNewCarFunction);
        managerLocalNewCarFunction.setVisible(false);

        this.add(managerLocalNewAddCar);
        managerLocalNewAddCar.setVisible(false);

        this.add(managerLocalNewUpdateCar);
        managerLocalNewUpdateCar.setVisible(false);

        this.add(managerLocalNewRemoveCar);
        managerLocalNewRemoveCar.setVisible(false);

        this.add(managerLocalOldCarFunction);
        managerLocalOldCarFunction.setVisible(false);

        this.add(managerLocalOldAddCar);
        managerLocalOldAddCar.setVisible(false);

        this.add(managerLocalOldUpdateCar);
        managerLocalOldUpdateCar.setVisible(false);

        this.add(managerLocalOldRemoveCar);
        managerLocalOldRemoveCar.setVisible(false);

        this.add(customerImportedCarsDetails);
        customerImportedCarsDetails.setVisible(false);

        this.add(customerImportedPurchaseCarFunctions);
        customerImportedPurchaseCarFunctions.setVisible(false);

        this.add(customerImportedSellCarToUs);
        customerImportedSellCarToUs.setVisible(false);

        this.add(customerImportedPlaceCarSell);
        customerImportedPlaceCarSell.setVisible(false);

        this.add(managerImportedOldAddCar);
        managerImportedOldAddCar.setVisible(false);

        this.add(managerImportedOldUpdateCar);
        managerImportedOldUpdateCar.setVisible(false);

        this.add(managerImportedOldRemoveCar);
        managerImportedOldRemoveCar.setVisible(false);

        this.add(customerImportedOldCarPurchase);
        customerImportedOldCarPurchase.setVisible(false);

        this.add(customerLocalCarsDetails);
        customerLocalCarsDetails.setVisible(false);

        this.add(customerLocalNewCarPurchase);
        customerLocalNewCarPurchase.setVisible(false);

        this.add(customerLocalOldCarPurchase);
        customerLocalOldCarPurchase.setVisible(false);

        this.add(customerLocalPlaceCarSell);
        customerLocalPlaceCarSell.setVisible(false);

        this.add(customerLocalCarsFunctionsSellCar);
        customerLocalCarsFunctionsSellCar.setVisible(false);

        this.add(customerLocalSellCarToUs);
        customerLocalSellCarToUs.setVisible(false);

        this.setIconImage(imageIcon.getImage());


    }


    public static void main(String[] args) {

        new MainFrame();

    }

}
