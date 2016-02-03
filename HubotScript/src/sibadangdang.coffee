# Description:
#   시바견 댕댕콘 만들기
#
# Commands:
#   bot 댕댕 왼쪽글자 오른쪽글자
#   bot 시바 왼쪽글자 오른쪽글자 - 빠른 시바견
#   bot 댕댕 긴글자 띄어쓰기 더하고 마지막글자 - 마지막글자만 오른쪽글자가 됨
#   bot 댕댕 한단어 - 한 단어는 인식 불가
#

# Heroku Env var에 JJAL_URL 추가 후 동작
JJAL_URL = process.env.JJAL_URL
QS = require 'querystring'

module.exports = (robot) ->
	robot.respond /(댕댕|시바) (.*) (.*)/i, (res) ->
		leftMsg = res.match[2]
		rightMsg = res.match[3]

		fastValue = 'off'
		if(res.match[1] is '시바')
			fastValue = 'on'

		data = QS.stringify({
			'left': leftMsg,
			'leftSize': '12',
			'right': rightMsg,
			'rightSize': '12',
			'fast': fastValue,
			'logodel': 'on',
			'lang': 'ko'
		})

		res.http(JJAL_URL).header('Content-Type', 'application/x-www-form-urlencoded').post(data) (err, response, body) ->
			if(err)
				res.send "에러 발생 :sad:"
				return
			res.send body