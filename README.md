
# Registration Form – Android App

## About the Project

This project was developed as part of **Mobile Application Development – Assignment 2**. The goal is to create a simple Android application that allows users to enter their personal information through a registration form and view a summary of the submitted data in a dialog window.

The application is developed in **Java** using **Android Studio**.

## Features

- Registration form with the following input fields:
  - Username
  - Full Name
  - Country
  - Email
  - Phone Number
  - Password
- Gender selection using radio buttons (Male or Female).
- Terms and Conditions acceptance checkbox.
- Create Account button to submit the form.
- Alert dialog displaying the entered registration details.
- Clear indication of whether the Terms and Conditions have been accepted.
- Scrollable layout to support smaller screens.

## Technologies Used

- **Language:** Java
- **IDE:** Android Studio
- **UI Design:** XML
- **Platform:** Android
- **Components:** EditText, RadioGroup, RadioButton, CheckBox, Button, ScrollView, AlertDialog

## Application Structure

The application consists of two main files:

- `activity_main.xml` – Defines the user interface and layout of the registration form.
- `MainActivity.java` – Handles user interactions, retrieves the entered data, and displays the registration summary in an alert dialog.

## How It Works

1. Launch the application to display the registration form.
2. Enter the required personal information.
3. Select a gender option.
4. Choose whether to accept the Terms and Conditions.
5. Tap the **Create Account** button.
6. A dialog titled **Registration Details** appears, displaying the entered information and the Terms and Conditions acceptance status.

## Example Output

After submitting the form, the application displays a dialog similar to the following:

```text
Registration Details

Username: johndoe
Full Name: John Doe
Country: Slovenia
Email: john.doe@example.com
Phone Number: +38612345678
Password: ********
Gender: Male
Terms Accepted: Yes
```

*The values above are examples only.*

## Installation and Setup

1. Clone this repository:

   ```bash
   git clone https://github.com/YOUR-USERNAME/YOUR-REPOSITORY.git
   ```

2. Open **Android Studio**.
3. Select **Open** and choose the cloned project folder.
4. Wait for Gradle to finish syncing.
5. Start an Android emulator or connect an Android device.
6. Click **Run** to build and launch the application.

Replace `YOUR-USERNAME` and `YOUR-REPOSITORY` with your GitHub username and repository name.

## Learning Objectives

This assignment provides practical experience with:

- Designing Android user interfaces using XML.
- Working with common Android UI components.
- Retrieving and processing user input in Java.
- Handling button click events.
- Reading checkbox and radio button states.
- Displaying information using `AlertDialog.Builder`.
- Creating scrollable layouts for different screen sizes.
