INSERT INTO app_user(username, password,first_name,last_name,role_id) 
	VALUES('mini','momi','mamo','memi',(
		SELECT role_id 
		FROM user_role ur 
		WHERE ur.name = 'PREMIUM_USER'
		));