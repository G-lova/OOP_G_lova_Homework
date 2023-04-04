package Seminar5.notebook.view;

import Seminar5.notebook.controller.UserController;
import Seminar5.notebook.log.Logger;
import Seminar5.notebook.model.User;
import Seminar5.notebook.util.Commands;

import java.util.List;
import java.util.Scanner;

public class UserView {
    private final UserController userController;

    public UserView(UserController userController) {
        this.userController = userController;
    }

    public void run(){
        Commands com;

        while (true) {
            String command = prompt("Введите команду: ");
            com = Commands.valueOf(command);
            StringBuilder logStr = new StringBuilder(com.toString());
            logStr.append(": ");
            if (com == Commands.EXIT) {
                logStr.append("successful");
                Logger log = new Logger(logStr.toString());
                return;
            }
            switch (com) {
                case CREATE:
                    String firstName = prompt("Имя: ");
                    String lastName = prompt("Фамилия: ");
                    String phone = prompt("Номер телефона: ");
                    User userToCreate = new User(firstName, lastName, phone);
                    userController.saveUser(userToCreate);
                    logStr.append("successful: ").append(userToCreate.getId())
                            .append(",").append(firstName).append(",")
                            .append(lastName).append(",").append(phone);
                    break;
                case READ:
                    String id = prompt("Идентификатор пользователя: ");
                    try {
                        User user = userController.readUser(Long.parseLong(id));
                        System.out.println(user);
                        System.out.println();
                        logStr.append("successful: ").append("ID: ").append(user.getId());
                    } catch (Exception e) {
                        logStr.append("ERROR ").append(e);
                        Logger log = new Logger(logStr.toString());
                        throw new RuntimeException(e);
                    }
                    break;
                case LIST:
                    List<User> users = userController.getAllUsers();
                    System.out.println("----------");
                    for(User user: users) {
                        System.out.println(user);
                        System.out.println("----------");
                    }
                    logStr.append("successful");
                    break;
                case UPDATE:
                    long userId = Long.parseLong(prompt("Input user id: "));
                    String updateName = prompt("Имя: ");
                    String updateLastName = prompt("Фамилия: ");
                    String updatePhone = prompt("Номер телефона: ");
                    User updatedUser = new User(updateName, updateLastName, updatePhone);
                    userController.userUpdate(userId, updatedUser);
                    logStr.append("successful: ").append(userId).append(",").append(updateName)
                            .append(",").append(updateLastName).append(",").append(updatePhone);
                    break;
                case DELETE:
                    long userToDelId = Long.parseLong(prompt("Input user id: "));
                    userController.userDelete(userToDelId);
                    logStr.append("successful: ID: ").append(userToDelId);
                    break;
            }
            Logger log = new Logger(logStr.toString());
        }
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
}