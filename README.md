# Gym Connect

A database system designed for LSU UREC to efficiently track and manage information about its members, memberships, class types, schedules, instructors, attendance, and locations.

## Table of Contents
- [Overview](#overview)
- [Features](#features)
- [Installation](#installation)
- [Usage](#usage)
- [Database Structure](#database-structure)
- [Contributing](#contributing)
- [License](#license)

## Overview
Gym Connect is a relational database that serves as a management tool for LSU University Recreation (UREC). It enables administrators and staff to keep a comprehensive record of:
- Member details and membership types (students, alumni, parents)
- Class offerings, including types, schedules, and instructors
- Attendance tracking for individual members
- Location of classes and events within UREC facilities

## Features
- Member Management: Add, update, and remove member profiles with unique membership types.
- Class Management: Track class types, schedules, instructors, and locations for each class.
- Attendance Tracking: Monitor individual attendance for each class.
- Instructor Scheduling: Assign and manage instructor schedules for various classes.

## Usage

1. Add Members:
   - Administrators can add new members to the database and specify membership types (e.g., current students, alumni, parents).

2. Schedule Classes:
   - Add, edit, and remove classes with details like type, instructor, and location.

3. Track Attendance:
   - Input and update attendance records for each class.

4. Manage Instructors:
   - Assign instructors to classes and manage their schedules.

## Database Structure

The database schema includes the following key entities:

- Members: Records of individual members with membership type and status.
- Membership Types: Differentiates member access (e.g., current student, alumni, parent).
- Classes: Information about available classes, including type, schedule, instructor, and location.
- Instructors: Profiles for instructors with details on which classes they are assigned.
- Attendance: Logs of member attendance for classes.
- Locations: Facilities within LSU UREC where classes or events are held.

## Contributing

We welcome contributions! Please fork this repository, make your changes, and submit a pull request.

1. Fork the Project
2. Create your Feature Branch (`git checkout -b feature/AmazingFeature`)
3. Commit your Changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the Branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## Authors

Contributed by Micaiah Hill-Shuva, Ariel Jupiter and Tyler Scott
