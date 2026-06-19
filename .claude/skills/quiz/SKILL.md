---
name: quiz
description: Run an adaptive quiz on a training topic to test retention
when_to_use: When the user wants to be tested on a topic
---

# Quiz Skill

Run an adaptive diagnostic quiz on the topic the user specifies.

Steps:
1. Ask 5-7 questions of increasing difficulty
2. Wait for answers one at a time (do NOT dump all questions)
3. After each answer: score it, explain what was right/wrong
4. At the end: update the scorecard in CLAUDE.md
5. Identify weak areas and recommend what to study next

Format each question as:
**Q[n]:** [question]
*Difficulty: [Beginner/Intermediate/Advanced]*

After quiz: generate a mini revision sheet for weak areas.