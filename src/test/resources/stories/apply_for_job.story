Narrative: As a user, I would like to apply for a given position

Scenario: Verify job application cannot be submitted without CV attached
Given user navigates to the 'Careers' page
And user clicks 'See All Our Roles' button
And user selects 'Engineering & IT' department in 'All Departments' select box
And user selects 'Krakow, Poland' office in 'All offices' select box
And user clicks 'Test Engineer' link in the list of found positions
And user enters his 'First name' - Artem
And user enters his 'Last name' - Laktionov
And user enters his 'Email' - laktionov_artem@ukr.net
When user submits the application form
Then user gets validation message 'This field is required.' for CV