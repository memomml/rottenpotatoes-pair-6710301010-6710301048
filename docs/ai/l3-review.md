# L3 Draft Review

## 1. Line-by-Line Review Table

| บรรทัดในร่าง (`l3-draft.md`) | ปัญหา | ตัดสิน |
| --- | --- | --- |
| 10: `REQ-10: The system shall reject the call with an error that names the five allowed ratings if an invalid rating is passed.` | ผู้ปกครองเลือกจาก 5 ค่า ไม่ได้พิมพ์เอง ลูกค้าไม่ได้ขอ | **ตัด** |
| 9: `REQ-9: When no movie matches the selected rating, the system shall return an empty list and shall not throw an exception.` | ตอบ open question ข้อ 1 แทนลูกค้า และพูดถึง exception ซึ่งเป็นรายละเอียดฝั่งโค้ด | **แก้**: ถาม customer proxy แล้วระบุข้อความที่ผู้ใช้เห็น |
| 21: `AC-1.5: The selection takes one call.` | one call วัดจากโค้ด ไม่ใช่สิ่งที่ผู้ใช้เห็น จึงไม่ Measurable | **ตัด** |
| 28: `### Story 3: Clear empty result` | เป็น sad path ของ Story 1 ไม่ใช่ story ใหม่ | **แก้**: ย้ายเป็นบัตรใบที่ 3 (Sad path of card 1) |
| 23-26: `### Story 2: Sort movies ... sorted newest first` | ยังไม่ครบความต้องการจาก customer proxy ที่ขอเรียงตามชื่อด้วย | **แก้**: เพิ่มการเรียงตามตัวอักษร (alphabetically) |
| 36: `**Suitability is not the same as rating.**` | ข้อกังวลที่ถูกต้อง ช่วยเตือนขอบเขตของระบบ | **เก็บ** |

## 2. Customer Proxy Confirmation
- เลือกได้ครั้งละหนึ่ง rating (ยังไม่เลือกหลาย rating พร้อมกัน)
- ถ้าไม่มีหนังใน rating นั้น ให้เห็นรายการว่างพร้อมข้อความ `No movies with this rating`
- นอกจากเรียงหนังใหม่ขึ้นก่อน (newest first) ขอให้เรียงตามชื่อ (alphabetically) ได้ด้วย

## 3. Confirmed Story Cards (Connextra Format & SMART)

### Card 1: Filter movies by rating
```text
Filter movies by rating
As a concerned parent
So that I can quickly browse movies appropriate for my family
I want to see only movies with a chosen rating
Happy: the parent picks one rating and sees only the movies with that rating
```

### Card 2: Sort movies
```text
Sort movies
As a moviegoer
So that I can find new releases and browse the catalog by name
I want the movie list sorted newest first or alphabetically
```

### Card 3: Sad path of card 1
```text
Sad path of card 1: when no movie has the chosen rating,
the parent sees no movies and the message No movies with this rating
```
