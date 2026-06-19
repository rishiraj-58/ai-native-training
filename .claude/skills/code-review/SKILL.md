---
name: code-review
description: Review Java code like a senior staff engineer
when_to_use: When the user shares Java code to be reviewed
---

# Senior Code Review

Review the provided Java code for:
1. Correctness — does it do what it claims?
2. Idiomatic Java — streams, optionals, generics used properly?
3. SOLID principles violations
4. Performance — unnecessary iterations, boxing, etc.
5. Naming and clarity
6. Missing edge cases

Format:
✅ What's good
⚠️ Minor improvements
❌ Must fix

Then show the improved version with inline comments explaining why.
Ask a follow-up question about one of the improvements.