package Exception;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AuthService {
    void validateRegistration(String login, String password, String confirmPassword) throws InvalidAuthDataLengthException, EmptyAuthDataException, InvalidAuthCharactersException, PasswordAuthConfirmationException {
        if (login.isEmpty() || password.isEmpty()|| confirmPassword.isEmpty()) {
            throw new EmptyAuthDataException("Полученные данные для регистрации содержат пустые поля");
        }

        if ( login.trim().length() > 20 || password.trim().length() > 20
                || confirmPassword.trim().length() > 20) {
            throw new InvalidAuthDataLengthException("Полученные данные для регистрации содержат поля, превышающие допустимую длину");
        }

        Pattern pattern = Pattern.compile("[^a-zA-Z0-1_]");
        Matcher matcherLogin = pattern.matcher(login);
        Matcher matcherPassword = pattern.matcher(password);
        Matcher matcherConfirmPassword = pattern.matcher(confirmPassword);
        if (matcherLogin.find() || matcherPassword.find() || matcherConfirmPassword.find()) {
            throw new InvalidAuthCharactersException("Полученные данные для регистрации содержат поля с неккоректными символами");
        }

        if (!password.equals(confirmPassword)) {
            throw new PasswordAuthConfirmationException("Пароли не совпадают");
        }
    }

    public static void main(String[] args) {
        try {
            AuthService authService = new AuthService();
            authService.validateRegistration("0101010101", "123456", "123456");
        } catch (PasswordAuthConfirmationException e) {
            e.printStackTrace();
        } catch (InvalidAuthCharactersException e) {
            e.printStackTrace();
        } catch (EmptyAuthDataException e) {
            e.printStackTrace();
        } catch (InvalidAuthDataLengthException e) {
            e.printStackTrace();
        }
    }
}
