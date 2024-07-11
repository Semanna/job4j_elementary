package ru.job4j.ex;

public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        for (User user : users) {
            if (login.equals(user.getUsername())) {
                return user;
            }
        }
        throw new UserNotFoundException("This user isn't found");
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (user.isValid() && user.getUsername().length() >= 3) {
            return true;
        }
        throw new UserInvalidException("This user isn't valid");
    }

    public static void main(String[] args) throws UserNotFoundException {
        User[] users = {
                new User("Pe", true)
        };
        try {
            User user = findUser(users, "Pe");
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserInvalidException eb) {
            System.out.println("This user isn't valid");
        } catch (UserNotFoundException ea) {
            System.out.println("This user isn't found");
        } catch (Exception e) {
            System.out.println("Any other errors. Exception has been caught.");
        }
    }
}