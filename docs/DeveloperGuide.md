

## [Project TechToday](https://github.com/AY1920S2-CS2113-T14-2/tp) - Developer Guide

By: `Team SE-EDU`      Since: `Jun 2016`      Licence: `MIT`


## Setting Up

Prerequisites: JDK 11, update Intellij to the most recent version

1. Open Intellij (if you are not in the welcome screen, click `File` > `Close Project` to close the existing project dialog first)
1. Set up the correct JDK version
   1. Click `Configure` > `Structure for New Projects` and then `Project Settings` > `Project` > `Project SDK`
   1. If JDK 11 is listed in the drop down, select it. If it is not, click `New...` and select the directory where you installed JDK 11
   1. Click `OK`
1. Click `Import Project`
1. **IMPORTANT: Locate the `build.gradle` file** in the project directory, select it, and click `OK`
1. If there are any further prompts, accept the defaults.
1. After the set up is complete, you can locate the `src/main/java/seedu/techtoday/TechToday.java` file, right-click it, and choose `Run TechToday.main()`. If the setup is correct, you should see something like the below:

        _ **_____________________________________________________________________________**_
        _                                                                                  _
        _                             Hello! Here's TechToday.                             _
        _            Let me show you some technology news to refresh your mind!            _
        _ **_____________________________________________________________________________**_
        _                    Your queries can be of the following forms:                   _
        _                                      1. help                                     _
        _                              2. view [article / job]                             _
        _                       3. save [article / job] INDEX_NUMBER                       _
        _                         4. create [article / job / note]                         _
        _                          5. list [article / job / note]                          _
        _                   6. delete [article / job / note] INDEX_NUMBER                  _
        _              7. addinfo [article / job / note] INDEX_NUMBER EXTRACT              _
        _                                      8. exit                                     _
        _                                                                                  _
        _ **_____________________________________________________________________________**_
             What can I do for you?

        No files with your data exits, we will create new files to save your data.
        __________________________________________________________________________________________

Type exit and press enter to let the execution proceed to the end. Also note how Intellij is now using Gradle to run your code (you can make Intellij run the code without Gradle [this way](tutorials/assets/RunUsingIntellij.png)).

* Acknowledgement- The set-up portion is a direct adaptation of the set-up instructions given to us for this project.

## Design 

{Describe the design and implementation of the product. Use UML diagrams and short code snippets where applicable.}

## Implementation

This section will describe details of implementation of features in TechToday.

### `view` feature

#### Overview

The view feature adds articles, notes and jobs into the Article, Note and Job List respectively.


## Product Scope
### Target user profile

* has a need to view and manage information on technology updates
* prefers desktop apps over other types
* prefers typing over mouse input
* has access to internet to receive updates


### Value proposition

Receive and manage the most updated articles and jobs information specifically related to technology.

## User Stories

|Version| As a ... | I want to ... | So that I can ...|
|--------|----------|---------------|------------------|
|v1.0|new user|see usage instructions|refer to them when I forget how to use the application|
|v2.0|user|find a to-do item by name|locate a to-do without having to go through the entire list|

## Non-Functional Requirements

{Give non-functional requirements}

## Glossary

* *glossary item* - Definition

## Instructions for Manual Testing
### Launch and Shutdown 
   1. Download the jar file and copy into an empty folder\
   2. Run the jar file in your terminal with the command `java -jar techtoday.jar`

### Creating an item
   1. 

### Deleting an item
1. Deleting a job from the job list
   a. Prerequisites: List all the saved jobs using the `list job` command
   b. Test case: `delete job 1`
      Expected: Deleting the following job:
   Title: 
   Date: 
   Category: 
   Text: 
   Extract: 
   c. Test case: `delete job x`(where x is larger than the list size)
      Expected: You can only delete article/job/note with valid index number! Your command format is incorrect. Try again
   Other incorrect delete commands to try: `delete`, `delete job x`







