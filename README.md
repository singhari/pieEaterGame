# Pie Eater

This fork of Ariana's Pie Eater game adds configuration for running the game online using Github codespaces. 

First, from this repository webpage, click on the green code button.  <img style="vertical-align:middle" src="https://images.jointheleague.org/module-navigation/code_button.png" height="25px">. In the popup window,

<center><img src="https://images.jointheleague.org/module-navigation/create_codespace.png" width="400px"></center> 

Click on the green 'Create Codespace' button. Creating the codespace will take a few minutes, and when it is done, you will get a Visual Studio Code window. THe next steps will focus on the 'ports' tab in the bottom pane, and the run/debug button, in the left side menu. Both are marked in red in the image below:

<center><img src="https://images.jointheleague.org/module-navigation/vscode_marked.png" width="400px"></center> 

## Open a screen

The VSCode editor you are using is running on a remote server, which does not have a screen. So we have to use a virtual screen, provided by a program called VNC. This screen will appear in a pane in VSCode or browser window. Here is how you open this window. 

In the bottom pane of the VSCode window, click on the "PORTS" tab. 

<center><img src="https://images.jointheleague.org/module-navigation/ports_pane.png" width="400px"></center> 

Hover over the "Forwarded Address" for port 6080. You will see a small icon
that looks like a globe. This will open a new browser window with a "noVNC" logo. 

<center><img src="https://images.jointheleague.org/module-navigation/novnc.png" width="400px"></center> 

Click on "Connect", then enter the password: "code4life"

Now you have a virtual screen running. When your program writes to the screen, it will show up in this window. 

 # Run the program

To run the program, click on the "Run Debug" icon in the left side menu" 

<center><img src="https://images.jointheleague.org/module-navigation/rundebug.png" width="300px"></center> 

At the top of the screen you will see the "RUN AND DEBUG" menu.

<center><img src="https://images.jointheleague.org/module-navigation/run_menu_closed.png" width="100px"></center> 

Click on the down arrow to open the menu. 

<center><img src="https://images.jointheleague.org/module-navigation/run_menu_open.png" width="300px"></center> 

The select "RobotDemo", the program that we are viewing the source code for. Then click on the green run arrow. 


Look in the virtual window you opened earlier. You should see a robot drawing a red square. 

<center><img src="./images/red_square.png" width="600px"></center>

