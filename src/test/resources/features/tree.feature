@NinjalinosTree
Feature: Tree Module in DsAlgo portal
  
  As a registered user,
  I want to navigate and interact with Tree module pages and editors,
  So that I can explore and practice tree-related concepts.

  Background: 
    Given The user is logged in and on the Tree page

  @T01
  Scenario: Verify navigation links in Tree module
    When The user clicks overview of tree
    Then The user should see the following links:
      | Overview of trees              |
      | Terminologies                  |
      | Types of Tree                  |
      | Tree Traversals                |
      | Traversals-Illustration        |
      | Binary Trees                   |
      | Types of Binary                |
      | Implementation in Python       |
      | Binary Tree Traversals         |
      | Applications of Binary trees   |
      | Implementation of Binary Trees |
      | Binary Search                  |
      | Implementation of BST          |

  @T02
  Scenario: Navigate to Overview of Trees page
    When The user clicks "Overview of Trees" link
    Then The user should be navigated to the Overview of Trees page

  @T03
  Scenario: Navigate to text editor in Overview of Trees
    When The user clicks "Try here" in Overview of Trees
    Then The user should be navigated to the text editor

  @T04
  Scenario: Run without code in Overview of Trees
    When The user clicks "Run" without entering code
    Then An alert message should appear

  @T05
  Scenario: Run with valid code in Overview of Trees
    When The user enters valid Python code and clicks "Run"
    Then The output should be displayed in the console

  @T06
  Scenario: Run with invalid code in Overview of Trees
    When The user enters invalid Python code and clicks "Run"
    Then An alert message should appear

  @T07
  Scenario: Navigate to Terminologies page
    When The user clicks "Terminologies" link
    Then The user should be navigated to the Terminologies page

  @T08
  Scenario: Navigate to text editor in Terminologies
    When The user clicks "Try here" in Terminologies
    Then The user should be navigated to the text editor

  @T09
  Scenario: Run without code in Terminologies
    When The user clicks "Run" without entering code
    Then An alert message should appear

  @T10
  Scenario: Run with valid code in Terminologies
    When The user enters valid Python code and clicks "Run"
    Then The output should be displayed in the console

  @T11
  Scenario: Run with invalid code in Terminologies
    When The user enters invalid Python code and clicks "Run"
    Then An alert message should appear

  @T12
  Scenario: Navigate to Types of Tree page
    When The user clicks "Types of Tree" link
    Then The user should be navigated to the Types of Tree page

  @T13
  Scenario: Navigate to text editor in Types of Tree
    When The user clicks "Try here" in Types of Tree
    Then The user should be navigated to the text editor

  @T14
  Scenario: Run without code in Types of Tree
    When The user clicks "Run" without entering code
    Then An alert message should appear

  @T15
  Scenario: Run with valid code in Types of Tree
    When The user enters valid Python code and clicks "Run"
    Then The output should be displayed in the console

  @T16
  Scenario: Run with invalid code in Types of Tree
    When The user enters invalid Python code and clicks "Run"
    Then An alert message should appear

  @T17
  Scenario: Navigate to Tree Traversals page
    When The user clicks "Tree Traversals" link
    Then The user should be navigated to the Tree Traversals page

  @T18
  Scenario: Navigate to text editor in Tree Traversals
    When The user clicks "Try here" in Tree Traversals
    Then The user should be navigated to the text editor

  @T19
  Scenario: Run without code in Tree Traversals
    When The user clicks "Run" without entering code
    Then An alert message should appear

  @T20
  Scenario: Run with valid code in Tree Traversals
    When The user enters valid Python code and clicks "Run"
    Then The output should be displayed in the console

  @T21
  Scenario: Run with invalid code in Tree Traversals
    When The user enters invalid Python code and clicks "Run"
    Then An alert message should appear

  @T22
  Scenario: Navigate to Traversals-Illustration page
    When The user clicks "Traversals-Illustration" link
    Then The user should be navigated to the Tree Traversals page

  @T23
  Scenario: Navigate to text editor in Traversals-Illustration
    When The user clicks "Try here" in Tree Traversals
    Then The user should be navigated to the text editor

  @T24
  Scenario: Run without code in Traversals-Illustration
    When The user clicks "Run" without entering code
    Then An alert message should appear

  @T25
  Scenario: Run with valid code in Traversals-Illustration
    When The user enters valid Python code and clicks "Run"
    Then The output should be displayed in the console

  @T26
  Scenario: Run with invalid code in Traversals-Illustration
    When The user enters invalid Python code and clicks "Run"
    Then An alert message should appear

  @T27
  Scenario: Navigate to Binary Trees page
    When The user clicks "Binary Trees" link
    Then The user should be navigated to the Binary Trees page

  @T28
  Scenario: Navigate to text editor in Binary Trees
    When The user clicks "Try here" in Tree Traversals
    Then The user should be navigated to the text editor

  @T29
  Scenario: Run without code in Binary Trees
    When The user clicks "Run" without entering code
    Then An alert message should appear

  @T30
  Scenario: Run with valid code in Binary Trees
    When The user enters valid Python code and clicks "Run"
    Then The output should be displayed in the console

  @T31
  Scenario: Run with invalid code in Binary Trees
    When The user enters invalid Python code and clicks "Run"
    Then An alert message should appear

  @T32
  Scenario: Navigate to Types of Binary Tree page
    When The user clicks "Types of Binary Tree" link
    Then The user should be navigated to the Types of Binary Tree page

  @T33
  Scenario: Navigate to text editor in Types of Binary Tree
    When The user clicks "Try here" in Tree Traversals
    Then The user should be navigated to the text editor

  @T34
  Scenario: Run without code in Types of Binary Tree
    When The user clicks "Run" without entering code
    Then An alert message should appear

  @T35
  Scenario: Run with valid code in Types of Binary Tree
    When The user enters valid Python code and clicks "Run"
    Then The output should be displayed in the console

  @T36
  Scenario: Run with invalid code in Types of Binary Tree
    When The user enters invalid Python code and clicks "Run"
    Then An alert message should appear

  @T37
  Scenario: Navigate to Implementation of Python page
    When The user clicks "Implementation of Python" link
    Then The user should be navigated to the Implementation of Python page

  @T38
  Scenario: Navigate to text editor in Implementation of Python
    When The user clicks "Try here" in Tree Traversals
    Then The user should be navigated to the text editor

  @T39
  Scenario: Run without code in Implementation of Python
    When The user clicks "Run" without entering code
    Then An alert message should appear

  @T40
  Scenario: Run with valid code in Implementation of Python
    When The user enters valid Python code and clicks "Run"
    Then The output should be displayed in the console

  @T41
  Scenario: Run with invalid code in Implementation of Python
    When The user enters invalid Python code and clicks "Run"
    Then An alert message should appear

  @T42
  Scenario: Navigate to Binary Tree Traversals page
    When The user clicks "Binary Tree Traversals" link
    Then The user should be navigated to the Binary Tree Traversals page

  @T43
  Scenario: Navigate to text editor in Binary Tree Traversals
    When The user clicks "Try here" in Tree Traversals
    Then The user should be navigated to the text editor

  @T44
  Scenario: Run without code in Binary Tree Traversals
    When The user clicks "Run" without entering code
    Then An alert message should appear

  @T45
  Scenario: Run with valid code in Binary Tree Traversals
    When The user enters valid Python code and clicks "Run"
    Then The output should be displayed in the console

  @T46
  Scenario: Run with invalid code in Binary Tree Traversals
    When The user enters invalid Python code and clicks "Run"
    Then An alert message should appear

  @T47
  Scenario: Navigate to Applications of Binary Trees page
    When The user clicks "Applications of Binary Trees" link
    Then The user should be navigated to the Applications of Binary Trees  page

  @T48
  Scenario: Navigate to text editor in Applications of Binary Trees
    When The user clicks "Try here" in Applications of Binary Trees
    Then The user should be navigated to the text editor

  @T49
  Scenario: Run without code in Applications of Binary Trees
    When The user clicks "Run" without entering code
    Then An alert message should appear

  @T50
  Scenario: Run with valid code in Applications of Binary Trees
    When The user enters valid Python code and clicks "Run"
    Then The output should be displayed in the console

  @T51
  Scenario: Run with invalid code in Applications of Binary Trees
    When The user enters invalid Python code and clicks "Run"
    Then An alert message should appear

  @T52
  Scenario: Navigate to text editor in Implementation of Binary Trees
    When The user clicks "Try here" in Tree Traversals
    Then The user should be navigated to the text editor

  @T53
  Scenario: Run without code in Implementation of Binary Trees
    When The user clicks "Run" without entering code
    Then An alert message should appear

  @T54
  Scenario: Run with valid code in Implementation of Binary Trees
    When The user enters valid Python code and clicks "Run"
    Then The output should be displayed in the console

  @T55
  Scenario: Run with invalid code in Implementation of Binary Trees
    When The user enters invalid Python code and clicks "Run"
    Then An alert message should appear

  @T56
  Scenario: Navigate to Binary Search
    When The user clicks "Binary Search" link
    Then The user should be navigated to the Binary Search page

  @T57
  Scenario: Navigate to text editor in
    When The user clicks "Try here" in Binary Search
    Then The user should be navigated to the text editor

  @T58
  Scenario: Run without code in Binary Search
    When The user clicks "Run" without entering code
    Then An alert message should appear

  @T59
  Scenario: Run with valid code in Binary Search
    When The user enters valid Python code and clicks "Run"
    Then The output should be displayed in the console

  @T60
  Scenario: Run with invalid code in Binary Search
    When The user enters invalid Python code and clicks "Run"
    Then An alert message should appear

  @T61
  Scenario: Navigate to Implementation of BST
    When The user clicks "Implementation of BST" link
    Then The user should be navigated to the Implementation of BST page

  @T62
  Scenario: Navigate to text editor in Implementation of BST
    When The user clicks "Try here" in Implementation of BST
    Then The user should be navigated to the text editor

  @T63
  Scenario: Run without code in Implementation of BST
    When The user clicks "Run" without entering code
    Then An alert message should appear

  @T64
  Scenario: Run with valid code in Implementation of BST
    When The user enters valid Python code and clicks "Run"
    Then The output should be displayed in the console

  @T65
  Scenario: Run with invalid code in Implementation of BST
    When The user enters invalid Python code and clicks "Run"
    Then An alert message should appear

  @T66
  Scenario: Navigate to Practice Questions page
    When The user clicks "Practice Questions" link
    Then The user should be navigated to the Practice Questions page

  @T67
  Scenario: View Practice Questions
    Given The user is on the Practice Questions page
    Then The user should see all listed questions
