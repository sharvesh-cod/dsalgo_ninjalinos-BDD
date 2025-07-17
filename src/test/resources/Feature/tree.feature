@NinjalinosTree
Feature: Tree Module in DsAlgo portal
  
  As a registered user,
  I want to navigate and interact with Tree module pages and editors,
  So that I can explore and practice tree-related concepts.

  Background: 
    Given the user is in Tree page after logged in

   @verifyingTreeHomePage
   Scenario: Verify if user can see all the links available in the page
    When The user scroll down the page
    Then User should view all the links available in page

   @TreeOverview
   Scenario: Verify that the user is able to navigate to Overview of Tree page
    When user clicks on overview button of Tree module
    Then user successfully navigates to the Overview of Tree page

   @OverviewTreeTryHere
   Scenario: Verify user is able to open Try here page from operations in tree overview page
    Given The user in the overview page of tree module
    When user clicks on try here button in Overview of Tree page
    Then user successfully navigates to code editor of the Overview of Tree page

  @OverviewTreeWithoutCode
  Scenario: Run without code in Overview of Trees
    Given The user in tryEditor page
    When The user clicks Run without entering code
    Then An alert message should appear

  @OverviewTreeValidCode
  Scenario: Run with valid code in Overview of Trees
    Given The user in tryEditor page
    When The user clicks Run after entering valid code
    Then The output should be displayed in the console

  @OverviewTreeInValidCode
  Scenario: Run with invalid code in Overview of Trees
    Given The user in tryEditor page
    When The user clicks run after entering invalid code
    Then An alert message should appear

  @Terminologiespage @TER1
  Scenario: Navigate to Terminologies page 
    When The user clicks Terminologies link
    Then The user should be navigated to the Terminologies page

  @TerminologiesTryHere @TER1
  Scenario: Navigate to text editor in Terminologies
    When The user clicks Try here in Terminologies
    Then The user should be navigated to the text editor

  @TerminologiesWithoutCode @TER1
  Scenario: Run without code in Terminologies
    Given The user on tryEditor page of Terminologies
    When The user clicks Run without entering code
    Then An alert message should appear

  @TerminologiesValidCode @TER1
  Scenario: Run with valid code in Terminologies
    Given The user in tryEditor page
    When The user clicks Run after entering valid code
    Then The output should be displayed in the console

  @TerminologiesInValidCode @TER1
  Scenario: Run with invalid code in Terminologies
    Given The user in tryEditor page
    When The user clicks Run after entering invalid code
    Then An alert message should appear

  @TypesofTrees @TT1
  Scenario: Navigate to Types of Tree page
    When The user clicks Types of Tree link
    Then The user should be navigated to the Types of Tree page

  @TypesofTreeTryHere @TT1
  Scenario: Navigate to text editor in Types of Tree
    When The user clicks Try here in Types of Tree
    Then The user should be navigated to the text editor

  @TypesofTreeWithoutCode @TT1
  Scenario: Run without code in Types of Tree
    Given The user on tryEditor page of Types of Tree
    When The user clicks Run without entering code
    Then An alert message should appear

  @TypesofTreeValidCode @TT1
  Scenario: Run with valid code in Types of Tree
    Given The user on tryEditor page of Types of Tree
    When The user clicks Run after entering valid code
    Then The output should be displayed in the console

  @TypesofTreeInValidCode @TT1
  Scenario: Run with invalid code in Types of Tree
    Given The user on tryEditor page of Types of Tree
    When The user clicks Run after entering invalid code
    Then An alert message should appear

  @TreeTraversalspage   @TT2
  Scenario: Navigate to Tree Traversals page
    When The user clicks Tree Traversals link
    Then The user should be navigated to the Tree Traversals page

  @TreeTraversalTryHere @TT2
  Scenario: Navigate to text editor in Tree Traversals
    When The user clicks Try here in Tree Traversals
    Then The user should be navigated to the text editor

  @TreeTraversalWithoutCode @TT2
  Scenario: Run without code in Tree Traversals
    Given The user on tryEditor page of Tree Traversals
    When The user clicks Run without entering code
    Then An alert message should appear

  @TreeTraversalValidCode  @TT2
  Scenario: Run with valid code in Tree Traversals
    Given The user on tryEditor page of Tree Traversals
    When The user enters valid Python code, clicks Run
    Then The output should be displayed in the console

  @TreeTraversalInValidCode  @TT2
  Scenario: Run with invalid code in Tree Traversals
    Given The user on tryEditor page of Tree Traversals
    When The user enters invalid Python code and clicks Run
    Then An alert message should appear

  @TraversalsIllustration
  Scenario: Navigate to Traversals-Illustration page
    When The user clicks Traversals-Illustration link
    Then The user should be navigated to the Tree Traversals page

  @TraversalsIllustrationTryHere
  Scenario: Navigate to text editor in Traversals-Illustration
    When The user clicks Try here in Tree Traversals-Illustration
    Then The user should be navigated to the text editor

  @TraversalsIllustrationWithoutCode
  Scenario: Run without code in Traversals-Illustration
    When The user clicks Run without entering code
    Then An alert message should appear

  @TraversalsIllustrationValidCode
  Scenario: Run with valid code in Traversals-Illustration
    When The user enters valid Python code and clicks Run
    Then The output should be displayed in the console

  @TraversalsIllustrationInValidCode
  Scenario: Run with invalid code in Traversals-Illustration
    When The user enters invalid Python code and clicks Run
    Then An alert message should appear

  @BinaryTreespage
  Scenario: Navigate to Binary Trees page
    When The user clicks Binary Trees link
    Then The user should be navigated to the Binary Trees page

  @BinaryTreesTryHere
  Scenario: Navigate to text editor in Binary Trees
    When The user clicks Try here in Tree Traversals
    Then The user should be navigated to the text editor

  @BinaryTreesWithoutCode
  Scenario: Run without code in Binary Trees
    When The user clicks Run without entering code
    Then An alert message should appear

  @BinaryTreesValidCode
  Scenario: Run with valid code in Binary Trees
    When The user enters valid Python code and clicks Run
    Then The output should be displayed in the console

  @BinaryTreesInValidCode
  Scenario: Run with invalid code in Binary Trees
    When The user enters invalid Python code and clicks Run
    Then An alert message should appear

  @TypesofBinaryTreepage
  Scenario: Navigate to Types of Binary Tree page
    When The user clicks Types of Binary Tree link
    Then The user should be navigated to the Types of Binary Tree page

  @TypesofBinaryTreeTryHere
  Scenario: Navigate to text editor in Types of Binary Tree
    When The user clicks Try here in Tree Traversals
    Then The user should be navigated to the text editor

  @TypesofBinaryTreeWithoutCode
  Scenario: Run without code in Types of Binary Tree
    Given The user in tryEditor page
    When The user clicks Run without entering code
    Then An alert message should appear

  @TypesofBinaryTreeValidCode
  Scenario: Run with valid code in Types of Binary Tree
    Given The user in tryEditor page
    When The user enters valid Python code and clicks Run
    Then The output should be displayed in the console

  @TypesofBinaryTreeInValidCode
  Scenario: Run with invalid code in Types of Binary Tree
    Given The user in tryEditor page
    When The user enters invalid Python code and clicks Run
    Then An alert message should appear

  @ImplementationofPython
  Scenario: Navigate to Implementation of Python page
    When The user clicks Implementation of Python link
    Then The user should be navigated to the Implementation of Python page

  @ImplementationofPythonTryHere
  Scenario: Navigate to text editor in Implementation of Python
    When The user clicks Try here in Tree Traversals
    Then The user should be navigated to the text editor

  @ImplementationofPythonWithoutCode
  Scenario: Run without code in Implementation of Python
    Given The user in tryEditor page
    When The user clicks Run without entering code
    Then An alert message should appear

  @ImplementationofPythonValidCode
  Scenario: Run with valid code in Implementation of Python
    Given The user in tryEditor page
    When The user enters valid Python code and clicks Run
    Then The output should be displayed in the console

  @ImplementationofPythonInValidCode
  Scenario: Run with invalid code in Implementation of Python
    Given The user in tryEditor page
    When The user enters invalid Python code and clicks Run
    Then An alert message should appear

  @BinaryTreeTraversalspage
  Scenario: Navigate to Binary Tree Traversals page
    When The user clicks Binary Tree Traversals link
    Then The user should be navigated to the Binary Tree Traversals page

  @BinaryTreeTraversalTryHere
  Scenario: Navigate to text editor in Binary Tree Traversals
    When The user clicks Try here in Tree Traversals
    Then The user should be navigated to the text editor

  @BinaryTreeTraversalWithoutCode
  Scenario: Run without code in Binary Tree Traversals
    Given The user in tryEditor page
    When The user clicks Run without entering code
    Then An alert message should appear

  @BinaryTreeTraversalValidCode
  Scenario: Run with valid code in Binary Tree Traversals
    Given The user in tryEditor page
    When The user enters valid Python code and clicks Run
    Then The output should be displayed in the console

  @BinaryTreeTraversalInValidCode
  Scenario: Run with invalid code in Binary Tree Traversals
    Given The user in tryEditor page
    When The user enters invalid Python code and clicks Run
    Then An alert message should appear

  @AppBinaryTrees
  Scenario: Navigate to Applications of Binary Trees page
    When The user clicks Applications of Binary Trees link
    Then The user should be navigated to the Applications of Binary Trees  page

  @AppBinaryTreeTryHere
  Scenario: Navigate to text editor in Applications of Binary Trees
    When The user clicks Try here in Applications of Binary Trees
    Then The user should be navigated to the text editor

  @AppBinaryTreeWithoutCode
  Scenario: Run without code in Applications of Binary Trees
    Given The user in tryEditor page
    When The user clicks Run without entering code
    Then An alert message should appear

  @AppBinaryTreeValidCode
  Scenario: Run with valid code in Applications of Binary Trees
    Given The user in tryEditor page
    When The user enters valid Python code and clicks Run
    Then The output should be displayed in the console

  @AppBinaryTreeInValidCode
  Scenario: Run with invalid code in Applications of Binary Trees
    Given The user in tryEditor page
    When The user enters invalid Python code and clicks Run
    Then An alert message should appear

  @ImplementOfBinaryTree
  Scenario: Navigate to Implementation of Binary Trees page
    When The user clicks Try here in Tree Traversals
    Then The user should be navigated to the text editor

  @ImplementOfBinaryTreeTryHere
  Scenario: Navigate to text editor in Implementation of Binary Trees page
    When The user clicks Try here in Tree Traversals
    Then The user should be navigated to the text editor

  @ImplementOfBinaryTreeWithoutCode
  Scenario: Run without code in Implementation of Binary Trees
    Given The user in tryEditor page
    When The user clicks Run without entering code
    Then An alert message should appear

  @ImplementOfBinaryTreeValidCode
  Scenario: Run with valid code in Implementation of Binary Trees
    Given The user in tryEditor page
    When The user enters valid Python code and clicks Run
    Then The output should be displayed in the console

  @ImplementOfBinaryTreeInValidCode
  Scenario: Run with invalid code in Implementation of Binary Trees
    Given The user in tryEditor page
    When The user enters invalid Python code and clicks Run
    Then An alert message should appear

  @BinarySearch
  Scenario: Navigate to Binary Search
    When The user clicks Binary Search link
    Then The user should be navigated to the Binary Search page

  @BinarySearchTryHere
  Scenario: Navigate to text editor in Binary Search
    When The user clicks Try here in Binary Search
    Then The user should be navigated to the text editor

  @BinarySearchwithoutCode
  Scenario: Run without code in Binary Search
    Given The user in tryEditor page
    When The user clicks Run without entering code
    Then An alert message should appear

  @BinarySearchValidCode
  Scenario: Run with valid code in Binary Search
    Given The user in tryEditor page
    When The user enters valid Python code and clicks Run
    Then The output should be displayed in the console

  @BinarySearchInValidCode
  Scenario: Run with invalid code in Binary Search
    Given The user in tryEditor page
    When The user enters invalid Python code and clicks Run
    Then An alert message should appear

  @ImplementationofBST
  Scenario: Navigate to Implementation of BST
    When The user clicks Implementation of BST link
    Then The user should be navigated to the Implementation of BST page

  @ImplementationofBSTTryHere
  Scenario: Navigate to text editor in Implementation of BST
    When The user clicks Try here in Implementation of BST
    Then The user should be navigated to the text editor

  @ImplementationofBSTWithoutCode
  Scenario: Run without code in Implementation of BST
    Given The user in tryEditor page
    When The user clicks Run without entering code
    Then An alert message should appear

  @ImplementationofBSTValidCode
  Scenario: Run with valid code in Implementation of BST
    Given The user in tryEditor page
    When The user enters valid Python code and clicks Run
    Then The output should be displayed in the console

  @ImplementationofBSTInValidCode
  Scenario: Run with invalid code in Implementation of BST
    Given The user in tryEditor page
    When The user enters invalid Python code and clicks Run
    Then An alert message should appear

#@TreePracticeQuestionlink
  #Scenario: Verify that the user is able to navigate to practice questions from Tree module
   #Given user is in Tree sections page 
    #When user clicks on the practice questions link in Tree module
    #Then user sucessfully navigates to practice questions of Tree module
    #And  user find blank page
