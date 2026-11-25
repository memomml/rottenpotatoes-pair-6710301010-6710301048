# Movie Filter and Sort Specification (AI Draft)

## 1. Requirements
- REQ-1: The movie list shall display each movie's title, rating, and release date.
- REQ-2: The user shall be able to select one rating from G, PG, PG-13, R, and NC-17.
- REQ-3: When a rating is selected, the system shall show only movies matching that rating.
- REQ-4: The full movie list shall be sorted with the newest movies first by default.
- REQ-5: The system shall not require login or collect any personal data.
- REQ-9: When no movie matches the selected rating, the system shall return an empty list and shall not throw an exception.
- REQ-10: The system shall reject the call with an error that names the five allowed ratings if an invalid rating is passed.

## 2. User Stories

### Story 1: Filter movies by rating
As a concerned parent
So that I can quickly browse movies appropriate for my family
I want to see only movies with a chosen rating

Acceptance Criteria:
- AC-1.1: The parent picks one rating and sees only movies with that rating.
- AC-1.5: The selection takes one call.

### Story 2: Sort movies
As a moviegoer
So that I can find new releases quickly
I want the movie list sorted newest first

### Story 3: Clear empty result
As a concerned parent
So that I know no movies match
I want to see an empty list when no movie matches

## 3. Assumptions
- Ratings are fixed to the five MPAA values: G, PG, PG-13, R, NC-17.

## 4. Concerns
- **Suitability is not the same as rating.** A rating is only an age guideline and may not reflect every parent's personal criteria.
- Open questions from intent (empty state message and multi-rating selection) still need customer proxy confirmation.
