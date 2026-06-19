# AI-Native Developer Training

A personal learning workspace for the AI-Native developer program — structured around Claude Code, Java fundamentals, design patterns, testing, and agile practices.

## Topics

| # | Topic | Directory |
|---|-------|-----------|
| 1 | Claude Code, MCP & Java OOP | `java/` |
| 2 | Collections, Streams & Lambdas | `java/` |
| 3 | Agile, Scrum & SDLC | `notes/` |
| 4 | Jira & Confluence | `notes/` |
| 5 | Java Design Patterns | `design-patterns/` |
| 6 | Error Handling, Logging & Code Quality | `java/` |
| 7 | Testing Foundations & AI-Augmented TDD | `testing/` |

## Project Structure

```
ai-native-training/
├── CLAUDE.md              # Persistent learning context & scorecard
├── CLAUDE.local.md        # Personal overrides (gitignored)
├── .claude/
│   ├── skills/            # Custom learning skills
│   │   ├── quiz/          # Adaptive quizzes with scorecard updates
│   │   ├── teach/         # Socratic teaching in small chunks
│   │   ├── code-review/   # Senior-level Java code review
│   │   └── flashcard/     # Spaced-repetition drills
│   └── settings.json      # Tool permissions
├── java/                  # Java exercises
├── design-patterns/       # Design pattern implementations
├── testing/               # TDD & test exercises
└── notes/                 # Revision sheets & session notes
```

## Getting Started

1. Clone this repo and open it in [Claude Code](https://docs.anthropic.com/en/docs/claude-code) or Cursor.
2. Fill in `CLAUDE.md` with your profile, goals, and knowledge scorecard.
3. Copy `CLAUDE.local.md` for any personal overrides (not tracked by git).
4. Use the skills to drive your sessions:
   - **teach** — learn a concept step by step with code exercises
   - **quiz** — test retention and update your scorecard
   - **code-review** — get senior-level feedback on Java code
   - **flashcard** — quick recall drills with spaced repetition

## Learning Approach

- Small chunks, not lectures — one concept at a time
- Active recall — explain concepts back before moving on
- Code first — write Java, then get it reviewed
- Spaced repetition — revisit weak areas before new topics
- Session logs and revision sheets saved in `notes/`

## About

Personal training repo for [Rishiraj](https://github.com/rishiraj-58) — junior developer building depth in Java/Spring Boot and AI-native development workflows.
