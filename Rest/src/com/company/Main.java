package com.company;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;
public class Main {

    public static MainFrame frame;

    public static void connect(PackageData pd){
        try{
            Socket socket = new Socket("127.0.0.1", 7777);
            ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());

            if(pd.getOperationType().equals("ADD")){
                outputStream.writeObject(pd);
            }
            else if(pd.getOperationType().equals("LIST")){
                outputStream.writeObject(pd);
                PackageData infoFromServer = (PackageData)inputStream.readObject();
                ArrayList<Client> arrayListFromServer = infoFromServer.getClients();
                String s = "";

                for(int i=0;i<arrayListFromServer.size();i++){
                    s+=arrayListFromServer.get(i)+"\n";
                }

                ListClient.text.append(s);
            }
            inputStream.close();
            outputStream.close();
            socket.close();



        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        frame = new MainFrame();
        frame.setVisible(true);
    }
}
