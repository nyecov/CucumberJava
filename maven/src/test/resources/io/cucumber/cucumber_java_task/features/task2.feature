Feature:ListCompare-No difference
Scenario: Validate that two lists contain the same items with name, price, and category, regardless of order
Given I have the following items in the first list:
| name   | price | category |
| apple  | 1.00  | fruit    |
| orange | 1.50  | fruit    |
| banana | 0.75  | fruit    |
And I have the following items in the second list:
| name   | price | category |
| apple  | 1.00  | fruit    |
| orange | 1.50  | fruit    |
| banana | 0.75  | fruit    |
When I compare both lists
Then the lists should contain the same items with name, price, and category, regardless of order
