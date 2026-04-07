# CS 210 Object Oriented Programming
Topic: JavaFX — Basics of GUI Programming
Lab session – 11
Term: Spring 2026

## Problem 1 (Guided)
(Hello JavaFX) Create a JavaFX application HelloJavaFX.java that:
1. Displays your full name as a Text node with font Times New Roman, bold, italic, size
20
2. Displays your student ID below the name in a different color (e.g. red)
3. Places both Text nodes inside a VBox with spacing 10, centered in a StackPane
4. Sets the window title to "Student Card" and the scene size to 300×150
Expected output:
A window titled Student Card showing your name in bold italic and your ID in red
below it.
## Problem 2 (Guided)
(Shapes Panel) Create ShapesPanel.java that builds a window (400×200) containing
three shapes arranged in a row using HBox with spacing 20 and padding 20:
1. A red-filled Rectangle (width 80, height 60) with rounded corners (arcWidth 20,
arcHeight 20) and a black stroke of width 2
2. A blue-filled Circle with radius 40 and a black stroke of width 2
3. A green-filled Ellipse with radiusX 50, radiusY 30 and a black stroke of width 2
Set the window title to "Shapes".
## Problem 3 (Guided)
(Property Binding Circle) Create CenteredCircle.java that displays a circle which
always stays centered regardless of window size:
1. Use a Pane as the root
2. Bind circle.centerXProperty() to pane.widthProperty().divide(2)
3. Bind circle.centerYProperty() to pane.heightProperty().divide(2)
4. Set radius to 50, fill to white, stroke to black, stroke width to 2
5. Set the scene to 300×300 and resize the window to verify the binding works
## Problem 4 (Guided)
(Layout Explorer) Create LayoutExplorer.java using a BorderPane as the root (scene
450×300):
1. Top: A gold-background HBox (padding 10, spacing 10) containing buttons "File",
"Save", and "Cancel". Apply style "-fx-background-color: gold;" to the
HBox.
2. Left: A VBox (padding 10, spacing 8) with a Label("Courses") and four course
labels: CS101, CS201, CS221, CS301.
3. Center: A GridPane (alignment CENTER, hgap/vgap 5, padding 10) with Label/TextField
pairs for First Name (row 0) and Last Name (row 1).
## Problem 5 (Independent)
(Traffic Light) Create TrafficLight.java that displays a traffic light UI:
1. Use a VBox (spacing 5, padding 20, centered) containing three Circle nodes of radius
30
2. Color them red, yellow, and green respectively; give each a dark gray stroke of width 2
3. Hard-code the red light as “active” (full opacity) and the other two as dim (opacity 0.3)
4. Add a Text node below the circles reading "Stop" in bold, font size 18
5. Set the scene background to dark gray using scene.setFill(Color.DARKGRAY)
## Problem 6 (Independent)
(Color Mixer) Create ColorMixer.java that displays a color preview panel:
1. Declare three double variables for R, G, B (values between 0.0 and 1.0) of your choice
2. Display a Rectangle (200×200) filled with new Color(r, g, b, 1)
3. Below the rectangle show three Text labels: "R: 0.xx", "G: 0.xx", "B: 0.xx"
4. Below the labels show the hex code as a Text node in bold (e.g. "#3A7FCC")
5. Arrange everything in a VBox (spacing 8, padding 20, centered)
6. Repeat with at least two more color combinations by changing the R/G/B values and
running again
## Problem 7 (Independent)
(Mini Profile Card) Create ProfileCard.java using a BorderPane (scene 400×250)
that resembles a student profile card:
1. Top: An HBox (padding 12) with a Label showing a fictional student name in white
bold font, styled with a navy background: "-fx-background-color: #2C3E50;"
2. Center: A GridPane (hgap 10, vgap 10, padding 20) showing three rows: Department,
Year, and GPA with their values in the second column
3. Bottom: A Label (padding 8) with text "New Uzbekistan University", cen-
tered, styled with a light gray background: "-fx-background-color: #ECF0F1;
-fx-font-size: 13;"
## Problem 8 (Independent)
(Resize-Aware Diagonal) Create DiagonalLine.java that draws a green diagonal line
which always stretches from the top-left to the bottom-right corner of the window:
1. Use a Pane as the root and create a Line with startX = 0, startY = 0
2. Bind line.endXProperty() to pane.widthProperty()
3. Bind line.endYProperty() to pane.heightProperty()
4. Set stroke to green and stroke width to 3
5. Set the scene to 400×300 and verify that resizing the window keeps the line anchored
corner-to-corner
## Challenge — Optional
(Rotating Ellipses) Create RotatingEllipses.java by extending Pane into a custom
class EllipsePane:
1. Override setWidth(double) and setHeight(double) to call a private method
paintEllipses() each time the pane is resized
2. In paintEllipses(), clear all children and draw 16 Ellipse objects in a loop
3. Each ellipse has centerX = width/2, centerY = height/2, radiusX = width/2 − 50,
radiusY = height/2 − 50, white fill, and a random stroke color via
Color.color(Math.random(), Math.random(), Math.random())
4. Rotate ellipse i by i × 180.0/16 degrees
5. Wrap EllipsePane in a Scene (500×500) and verify that the pattern redraws correctly
when resized.
Page 10
