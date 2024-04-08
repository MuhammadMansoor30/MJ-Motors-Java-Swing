package guiOne;

import org.djbros.LocalCar;
import org.djbros.ShowRoomCars;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import static guiOne.MainFrame.customerLocalCarFunction;


public class CustomerLocalCarsDetails extends JPanel {
    JTable jTableNewLocal, jTableOldLocal;
    JScrollPane jScrollPaneNewLocal, jScrollPaneOldLocal;
    public static int index;


    CustomerLocalCarsDetails() {
        setVisible(true);
        setBackground(Color.BLUE);
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setSize(600, 600);
        add(Box.createRigidArea(new Dimension(0, 80)));

        JLabel newImportedLabel = new JLabel();
        newImportedLabel.setVisible(true);
        newImportedLabel.setText("LOCAL NEW CARS DETAILS");
        newImportedLabel.setForeground(Color.WHITE);
        add(newImportedLabel);
        newImportedLabel.setLayout(new BoxLayout(newImportedLabel, BoxLayout.X_AXIS));
        newImportedLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        add(Box.createRigidArea(new Dimension(0, 15)));

        jScrollPaneNewLocal = new JScrollPane();

        String column[] = {"Car Name", "Car Type", "Price", "Car Model"};

        LocalCar l = new LocalCar();
        l.populateNewCarArray();


        ArrayList<ArrayList<String>> twoDArrayListRow = new ArrayList<>();
        String s;
        String[] temp;
        for (int i = 0; i < ShowRoomCars.newLocalCars.size(); i++) {
            s = ShowRoomCars.newLocalCars.get(i).carName + "," + ShowRoomCars.newLocalCars.get(i).carType + "," +
                    ShowRoomCars.newLocalCars.get(i).carPrice + "," +
                    ShowRoomCars.newLocalCars.get(i).carModel + "\n";
            temp = s.split(",");

            twoDArrayListRow.add(new ArrayList<>());
            for (int j = 0; j < temp.length; j++) {
                twoDArrayListRow.get(i).add(temp[j]);
            }

        }
        String[][] arrayList = new String[0][];
        if (!twoDArrayListRow.isEmpty()) {
            arrayList = new String[twoDArrayListRow.size()][twoDArrayListRow.get(0).size()];

            for (int i = 0; i < twoDArrayListRow.size(); i++) {
                for (int j = 0; j < twoDArrayListRow.get(i).size(); j++) {
                    arrayList[i][j] = twoDArrayListRow.get(i).get(j);
                }
            }

        }

        jTableNewLocal = new JTable();
        jScrollPaneNewLocal = new JScrollPane();

        jTableNewLocal.getTableHeader().setReorderingAllowed(false);

        jTableNewLocal.setModel(new DefaultTableModel(arrayList,
                column));

        jScrollPaneNewLocal.setViewportView(jTableNewLocal);
        add(jScrollPaneNewLocal);

        add(Box.createRigidArea(new Dimension(0, 30)));
        JLabel oldImportedLabel = new JLabel();
        oldImportedLabel.setVisible(true);
        oldImportedLabel.setText("LOCAL OLD CARS DETAILS");
        oldImportedLabel.setForeground(Color.WHITE);
        add(oldImportedLabel);
        oldImportedLabel.setLayout(new BoxLayout(oldImportedLabel, BoxLayout.X_AXIS));
        oldImportedLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        add(Box.createRigidArea(new Dimension(0, 15)));


        jScrollPaneOldLocal = new JScrollPane();

        String columnn[] = {"Car Name", "Car Type", "Price", "Car Model", "Condition"};

        LocalCar a = new LocalCar();
        a.populateOldCarArray();


        ArrayList<ArrayList<String>> twoDArrayListRoww = new ArrayList<>();
        String g;
        String[] tempp;
        for (int i = 0; i < ShowRoomCars.oldLocalCars.size(); i++) {
            g = ShowRoomCars.oldLocalCars.get(i).carName + "," + ShowRoomCars.oldLocalCars.get(i).carType + "," +
                    ShowRoomCars.oldLocalCars.get(i).carPrice +","+ ShowRoomCars.oldLocalCars.get(i).carModel + "," +
                    ShowRoomCars.oldLocalCars.get(i).carCondition + "\n";
            tempp = g.split(",");

            twoDArrayListRoww.add(new ArrayList<>());
            for (int j = 0; j < tempp.length; j++) {
                twoDArrayListRoww.get(i).add(tempp[j]);
            }

        }
        String[][] arrayListt = new String[0][];
        if (!twoDArrayListRoww.isEmpty()) {
            arrayListt = new String[twoDArrayListRoww.size()][twoDArrayListRoww.get(0).size()];

            for (int i = 0; i < twoDArrayListRoww.size(); i++) {
                for (int j = 0; j < twoDArrayListRoww.get(i).size(); j++) {
                    arrayListt[i][j] = twoDArrayListRoww.get(i).get(j);
                }
            }

        }

        jTableOldLocal = new JTable();
        jScrollPaneOldLocal = new JScrollPane();

        jTableOldLocal.getTableHeader().setReorderingAllowed(false);

        jTableOldLocal.setModel(new DefaultTableModel(arrayListt,
                columnn));

        jScrollPaneOldLocal.setViewportView(jTableOldLocal);
        add(jScrollPaneOldLocal);
        add(Box.createRigidArea(new Dimension(0, 50)));

        JPanel panel1 = new JPanel();
        add(panel1);
        panel1.setVisible(true);
        panel1.setBackground(Color.BLUE);
        panel1.setLayout(new BoxLayout(panel1, BoxLayout.X_AXIS));
        JButton jButtonbackButton = new JButton("BACK");
        panel1.add(jButtonbackButton);
        jButtonbackButton.setVisible(true);
        jButtonbackButton.setForeground(Color.WHITE);
        jButtonbackButton.setBackground(Color.BLACK);
        jButtonbackButton.setVisible(true);
        jButtonbackButton.setMinimumSize(new Dimension(180, 40));
        jButtonbackButton.setMaximumSize(new Dimension(180, 40));
        jButtonbackButton.setAlignmentX(Component.CENTER_ALIGNMENT);

        add(Box.createRigidArea(new Dimension(0, 50)));
        panel1.add(Box.createRigidArea(new Dimension(10, 0)));

        JButton jButtonRefreshButton = new JButton("REFRESH");
        panel1.add(jButtonRefreshButton);
        jButtonRefreshButton.setVisible(true);
        jButtonRefreshButton.setForeground(Color.WHITE);
        jButtonRefreshButton.setBackground(Color.BLACK);
        jButtonRefreshButton.setVisible(true);
        jButtonRefreshButton.setMinimumSize(new Dimension(180, 40));
        jButtonRefreshButton.setMaximumSize(new Dimension(180, 40));
        jButtonRefreshButton.setAlignmentX(Component.CENTER_ALIGNMENT);


        jButtonbackButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                customerLocalCarFunction.setVisible(true);


            }
        });
        jButtonRefreshButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ((DefaultTableModel) jTableNewLocal.getModel()).setRowCount(0);
                LocalCar a = new LocalCar();
                a.populateNewCarArray();

                ArrayList<ArrayList<String>> twoDArrayListRow = new ArrayList<>();
                String s;
                String[] temp;
                for (int i = 0; i < ShowRoomCars.newLocalCars.size(); i++) {
                    s = ShowRoomCars.newLocalCars.get(i).carName + "," + ShowRoomCars.newLocalCars.get(i).carType + "," +
                            ShowRoomCars.newLocalCars.get(i).carPrice + "," +
                            ShowRoomCars.newLocalCars.get(i).carModel + "\n";
                    temp = s.split(",");

                    twoDArrayListRow.add(new ArrayList<>());
                    for (int j = 0; j < temp.length; j++) {
                        twoDArrayListRow.get(i).add(temp[j]);
                    }

                }
                if (!twoDArrayListRow.isEmpty()) {
                    String[][] arrayList = new String[twoDArrayListRow.size()][twoDArrayListRow.get(0).size()];

                    for (int i = 0; i < twoDArrayListRow.size(); i++) {
                        for (int j = 0; j < twoDArrayListRow.get(i).size(); j++) {
                            arrayList[i][j] = twoDArrayListRow.get(i).get(j);
                        }
                    }

                    jTableNewLocal.setModel(new DefaultTableModel(arrayList,
                            column));


                }

                ((DefaultTableModel) jTableOldLocal.getModel()).setRowCount(0);
                LocalCar b = new LocalCar();
                b.populateOldCarArray();

                ArrayList<ArrayList<String>> twoDArrayListRoww = new ArrayList<>();
                String l;
                String[] tempp;
                for (int i = 0; i < ShowRoomCars.oldLocalCars.size(); i++) {
                    l = ShowRoomCars.oldLocalCars.get(i).carName + "," + ShowRoomCars.oldLocalCars.get(i).carType + "," +
                            ShowRoomCars.oldLocalCars.get(i).carPrice +","+ ShowRoomCars.oldLocalCars.get(i).carModel + "," +
                            ShowRoomCars.oldLocalCars.get(i).carCondition + "\n";
                    tempp = l.split(",");

                    twoDArrayListRoww.add(new ArrayList<>());
                    for (int j = 0; j < tempp.length; j++) {
                        twoDArrayListRoww.get(i).add(tempp[j]);
                    }

                }
                if (!twoDArrayListRoww.isEmpty()) {
                    String[][] arrayListt = new String[twoDArrayListRoww.size()][twoDArrayListRoww.get(0).size()];

                    for (int i = 0; i < twoDArrayListRoww.size(); i++) {
                        for (int j = 0; j < twoDArrayListRoww.get(i).size(); j++) {
                            arrayListt[i][j] = twoDArrayListRoww.get(i).get(j);
                        }
                    }

                    jTableOldLocal.setModel(new DefaultTableModel(arrayListt,
                            columnn));

                }

            }
        });


    }


}
