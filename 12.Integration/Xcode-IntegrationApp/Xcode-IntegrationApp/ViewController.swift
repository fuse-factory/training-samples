//
//  ViewController.swift
//  Xcode-IntegrationApp
//
//  Created by Ian Y. Choi on 21/06/2017.
//  Copyright © 2017 FuseTools. All rights reserved.
//

import UIKit

class ViewController: UIViewController {

    @IBOutlet weak var mainView: UIView!
    
    class func statusBarHeight() -> CGFloat {
        let statusBarSize = UIApplication.shared.statusBarFrame.size
        return Swift.min(statusBarSize.width, statusBarSize.height)
    }
    
    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view, typically from a nib.
        if let animatedPanelView: ViewHandle? = ExportedViews.instantiate("AnimatedPanel"),
            let view: UIView = animatedPanelView?.view {
            mainView.addSubview(view)
            
            let width = mainView.frame.width
            let height = mainView.frame.height
            
            view.frame = CGRect(x: 0, y: 0, width: width, height: height)
        }
    }

    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
        // Dispose of any resources that can be recreated.
    }


}

