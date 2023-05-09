# Password Manager

This is a simple password manager program written in Java that allows the user to store and retrieve passwords for different accounts. The program uses a `HashMap` to store the passwords, where the key is the account name and the value is the password.

#### Note: The passwords are stored in memory and will be lost once the program is closed. This program is not intended for secure password storage.

## Usage

To use the program, simply run the `main` method in the `PasswordManager` class. The program will display a menu with three options:

1. Store password
2. Retrieve password
3. Exit

### Store Password

To store a password, select option 1 from the menu and enter the account name and password when prompted. The program will store the password in the `HashMap` and display a success message.

### Retrieve Password

To retrieve a password, select option 2 from the menu and enter the account name when prompted. If the password exists in the `HashMap`, the program will display the password. Otherwise, it will display a message indicating that no password was found for the given account name.

### Exit

To exit the program, select option 3 from the menu. The program will display a message indicating that it is exiting and then terminate.

## Package

This program is included in the `oopsdan` package. To use the program in your own Java project, you can simply import the `oopsdan.PasswordManager` class and call it's `main` method.

## License

This project is released under the MIT license. See the `LICENSE` file for more information.
