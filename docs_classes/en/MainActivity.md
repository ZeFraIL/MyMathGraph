# MainActivity Class Description

## 1. General information
*   **Class Name:** `MainActivity`
*   **Type:** Activity
*   **Purpose:** This is the entry point of the application. It serves as a main menu where users can choose which mathematical function they want to explore.
*   **Interaction:** It launches other activities (`LinearFunction`, `QuadraticFunction`, etc.) based on user selection.

## 2. Variables (class fields)
*No member variables are explicitly defined in the class body; it only uses local variables and methods to handle transitions.*

## 3. Classroom Methods

### Method name: `onCreate`
*   **Type:** `protected`
*   **Return value:** `void`
*   **Parameters:** `Bundle savedInstanceState`
*   **What does the method do:** Initializes the activity and sets the content view to `activity_main.xml`.
*   **When called:** When the app is launched.

### Navigation Methods (`goLinear`, `goQuadratic`, `goSeveral`, `goSinCos`)
*   **Type:** `public`
*   **Return value:** `void`
*   **Parameters:** `View view`
*   **What they do:** Create an `Intent` to transition from `MainActivity` to the target Activity and call `startActivity(go)`.
*   **When called:** When the respective button is clicked on the main screen.

## 4. Lifecycle
*   **`onCreate()`:** Sets up the main menu layout.

## 5. Interface Interaction (UI)
*   **Elements:** Several `Button` components.
*   **Connection:** Handled via the `android:onClick` attribute in the layout XML.

## 6. Interaction with other components
*   **Intents:** Uses explicit Intents to start other screens.

## 7. General logic of the class
It acts as a router. It doesn't perform calculations itself; it just directs the user to the correct part of the app.

## 8. Simplified explanation
Think of `MainActivity` as the "Front Door" or the "Main Menu" of a restaurant. You don't eat at the door; you use the menu to choose where you want to go (Linear, Quadratic, etc.).
