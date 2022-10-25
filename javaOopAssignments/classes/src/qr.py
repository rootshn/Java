import wifi_qrcode_generator as qr

qrCode = qr.wifi_qrcode('OX_COFFEE', False ,'WPA', 'oxcoffee2021')
qrCode.show(
    qrCode.save("my_wifi_qr.png")
)