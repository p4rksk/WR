insert into user_tb (user_name, password_hash, nick_name, img_name, img_path, oauth_id, provider, join_date, created_at,  updated_at)
values  ('jhone', '$2a$10$thisIsFakeHashForTest1234', 'jhone', 'jhone.png', '/images/user/jhone.png', null, null, '2025-01-01 00:00:00', '2025-01-01 00:00:01', null ),
        ('강영태', '$2a$10$thisIsFakeHashForTest1234', '강영태', '강영태.png', '/images/user/강영태.png', null, null, '2025-01-01 00:00:00', '2025-01-01 00:00:01', null ),
        ('김민우', '$2a$10$thisIsFakeHashForTest1234', '김민우', '김민우.jpg', '/images/user/김민우.png', null, null, '2025-01-01 00:00:00', '2025-01-01 00:00:01', null ),
        ('김요한', '$2a$10$thisIsFakeHashForTest1234', '김요한', '김요한.png', '/images/user/김요한.png', null, null, '2025-01-01 00:00:00', '2025-01-01 00:00:01', null ),
        ('김준식', '$2a$10$thisIsFakeHashForTest1234', '김준식', '김준식.png', '/images/user/김준식.png', null, null, '2025-01-01 00:00:00', '2025-01-01 00:00:01', null ),
        ('김진우', '$2a$10$thisIsFakeHashForTest1234', '김진우', '김진우.jpg', '/images/user/김진우.jpg', null, null, '2025-01-01 00:00:00', '2025-01-01 00:00:01', null ),
        ('김호균', '$2a$10$thisIsFakeHashForTest1234', '김호균', '김호균.jpg', '/images/user/김호균.jpg', null, null, '2025-01-01 00:00:00', '2025-01-01 00:00:01', null ),
        ('문지원', '$2a$10$thisIsFakeHashForTest1234', '문지원', '문지원.png', '/images/user/문지원.png', null, null, '2025-01-01 00:00:00', '2025-01-01 00:00:01', null ),
        ('박강혁', '$2a$10$thisIsFakeHashForTest1234', '박강혁', '박강혁.png', '/images/user/박강혁.png', null, null, '2025-01-01 00:00:00', '2025-01-01 00:00:01', null ),
        ('박호태', '$2a$10$thisIsFakeHashForTest1234', '박호태', '박호태.png', '/images/user/박호태.jpg', null, null, '2025-01-01 00:00:00', '2025-01-01 00:00:01', null ),
        ('김효진', '$2a$10$thisIsFakeHashForTest1234', '김효진', '여자2.jpg', '/images/user/여자2.jpg', null, null, '2025-01-01 00:00:00', '2025-01-01 00:00:01', null ),
        ('김유진', '$2a$10$thisIsFakeHashForTest1234', '김유진', '여자3.png', '/images/user/여자3.png', null, null, '2025-01-01 00:00:00', '2025-01-01 00:00:01', null ),
        ('김지원', '$2a$10$thisIsFakeHashForTest1234', '김지원', '여자4.png', '/images/user/여자4.png', null, null, '2025-01-01 00:00:00', '2025-01-01 00:00:01', null );
        
insert into team (team_name, created_at, updated_at)
values  ('우리들의 스터디', '2025-02-02 00:00:00', null),
        ('이달의 독서왕', '2025-02-03 00:00:00', null),
        ('매주 득근', '2025-02-04 00:00:00', null),
        ('건강해지는 모임', '2025-02-05 00:00:00', null);

insert into member (user_id, team_id, role, created_at, updated_at)
values  (1, 1, 'READER', '2025-02-02 00:00:00', null), -- jhone이 우리들의 스터디를 만듦 --
        (2, 1, 'MEMBER', '2025-02-02 01:00:00', null), -- 강영태가 우리들의 스터디의 가입 --
        (3, 1, 'MEMBER', '2025-02-02 01:05:00', null), -- 김민우가 우리들의 스터디의 가입 --
        (4, 1, 'MEMBER', '2025-02-02 01:10:00', null), -- 김요한이 우리들의 스터디의 가입 --
        (5, 2, 'READER', '2025-02-03 01:00:00', null), -- 김준식 이달의 독서왕 만듦 --
        (6, 2, 'MEMBER', '2025-02-03 00:00:00', null), -- 김진우 이달의 독서왕 가입 --
        (7, 2, 'MEMBER', '2025-02-03 01:00:00', null), -- 김호균 이달의 독서왕 가입 --
        (9, 3, 'READER', '2025-02-04 01:10:00', null), -- 박강혁 매주 득근 만듦 --
        (10, 3, 'MEMBER', '2025-02-04 00:00:00', null), -- 박호태 매주 득근근 가입 --
        (11, 4, 'READER', '2025-02-05 01:00:00', null), -- 김효진 건강해지는 모임 만듦 --
        (12, 4, 'MEMBER', '2025-02-05 01:05:00', null), -- 김유진 건강해지는 모임 가입 --
        (13, 4, 'MEMBER', '2025-02-05 01:10:00', null); -- 김지원 건강해지는 모임 가입 --